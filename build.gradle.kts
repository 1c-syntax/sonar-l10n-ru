import me.qoomon.gradle.gitversioning.GitVersioningPluginConfig
import me.qoomon.gradle.gitversioning.GitVersioningPluginConfig.CommitVersionDescription
import me.qoomon.gradle.gitversioning.GitVersioningPluginConfig.VersionDescription
import org.apache.tools.ant.filters.EscapeUnicode
import java.util.*

plugins {
    java
    `maven-publish`
    jacoco
    id("org.cadixdev.licenser") version "0.6.1"
    id("org.sonarqube") version "4.0.0.2929"
    id("me.qoomon.git-versioning") version "3.0.0"
    id("com.github.ben-manes.versions") version "0.28.0"
}

repositories {
    mavenCentral()
}

group = "com.github.1c-syntax"
description = "Translate SonarQube web application in Russian"

gitVersioning.apply(closureOf<GitVersioningPluginConfig> {
    preferTags = true
    branch(closureOf<VersionDescription> {
        pattern = "^(?!v[0-9]+).*"
        versionFormat = "\${branch}-\${commit.short}\${dirty}"
    })
    tag(closureOf<VersionDescription> {
        pattern = "v(?<tagVersion>[0-9].*)"
        versionFormat = "\${tagVersion}\${dirty}"
    })
    commit(closureOf<CommitVersionDescription> {
        versionFormat = "\${commit.short}\${dirty}"
    })
})

val sonarQubeVersion = "10.7.0.96327"
val sonarQubeAPIPluginVersion = "10.11.0.2468" // https://github.com/SonarSource/sonar-plugin-api#compatibility
val junitVersion = "5.6.1"

dependencies {
    compileOnly("org.sonarsource.api.plugin", "sonar-plugin-api", sonarQubeAPIPluginVersion)

    testImplementation("org.junit.jupiter", "junit-jupiter-api", junitVersion)
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", junitVersion)

    testImplementation("org.sonarsource.api.plugin", "sonar-plugin-api", sonarQubeAPIPluginVersion)
    testImplementation("org.sonarsource.sonarqube", "sonar-testing-harness", sonarQubeVersion)
    testImplementation("org.sonarsource.sonarqube", "sonar-core", sonarQubeVersion)
    testImplementation("org.assertj", "assertj-core", "3.16.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Xlint:unchecked")
    options.compilerArgs.add("-Xlint:deprecation")
}

tasks.test {
    useJUnitPlatform()

    testLogging {
        events("passed", "skipped", "failed")
    }

    reports {
        html.required.set(true)
    }
}

tasks.check {
    dependsOn(tasks.jacocoTestReport)
}

tasks.jacocoTestReport {
    reports {
        xml.required.set(true)
        xml.outputLocation.set(File("$buildDir/reports/jacoco/test/jacoco.xml"))
    }
}

tasks.processResources {
    filteringCharset = "UTF-8"

    // native2ascii gradle replacement
    filesMatching("**/*.properties") {
        filter<EscapeUnicode>()
    }
}

tasks.jar {
    manifest {
        attributes["Plugin-Key"] = "l10nru"
        attributes["Plugin-Description"] = "${project.description}"
        attributes["Plugin-Class"] = "org.silverbulleters.sonar.plugins.l10n.RussianPackPlugin"
        attributes["Plugin-Name"] = "Russian Pack"
        attributes["Plugin-Version"] = "${project.version}"

        attributes["Plugin-License"] = "GNU LGPL v3"

        attributes["Plugin-Homepage"] = "https://github.com/1c-syntax/sonar-l10n-ru"
        attributes["Plugin-IssueTrackerUrl"] = "https://github.com/1c-syntax/sonar-l10n-ru/issues"
        attributes["Plugin-SourcesUrl"] = "https://github.com/1c-syntax/sonar-l10n-ru"
        attributes["Plugin-Developers"] = "Alexey Lustin, Nikita Gryzlov"

        attributes["Plugin-Organization"] = "SilverBulleters, 1c-syntax and contributors"
        attributes["Plugin-OrganizationUrl"] = "https://github.com/1c-syntax"

    }

    exclude("**/core.properties")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifact(tasks["jar"])
            pom {
                name.set("Russian Pack for SonarQube")
                url.set("https://github.com/1c-syntax/sonar-l10n-ru")
                inceptionYear.set("2016")
                organization {
                    name.set("1c-syntax")
                    url.set("https://github.com/1c-syntax")
                }

                licenses {
                    license {
                        name.set("GNU LGPL v3")
                        url.set("http://www.gnu.org/licenses/lgpl.txt")
                        distribution.set("repo")
                    }
                }

                issueManagement {
                    system.set("GitHub")
                    url.set("https://github.com/1c-syntax/sonar-l10n-ru/issues")
                }

                ciManagement {
                    system.set("GitHub Actions")
                    url.set("https://github.com/1c-syntax/sonar-l10n-ru/actions")
                }

                scm {
                    connection.set("scm:git:https://github.com/1c-syntax/sonar-l10n-ru.git")
                    url.set("https://github.com/1c-syntax/sonar-l10n-ru")
                }


                developers {
                    developer {
                        id.set("allustin")
                        name.set("Alexey Lustin")
                        organization.set("SilverBulleters, LLC")
                        organizationUrl.set("https://www.silverbulleters.org")
                    }
                    developer {
                        id.set("nixel2007")
                        name.set("Nikita Gryzlov")
                        organization.set("1c-syntax")
                        email.set("nixel2007@gmail.com")
                    }
                }

                contributors {
                    contributor {
                        name.set("Evgeniy Sosna")
                        organization.set("SomeWhere")
                        organizationUrl.set("https://github.com/pumbaEO")
                    }
                    contributor {
                        name.set("Andrei Ovsiankin")
                        organization.set("Evil Beaver Soft")
                        email.set("https://github.com/EvilBeaver")
                    }
                }
            }
        }
    }
}

license {
    header(rootProject.file("license/HEADER.txt"))
    newLine(false)
    ext["year"] = "2020-" + Calendar.getInstance().get(Calendar.YEAR)
    ext["name"] = "1c-syntax"
    ext["project"] = "Russian Pack for SonarQube"
    exclude("**/*.properties")
}

sonarqube {
    properties {
        property("sonar.sourceEncoding", "UTF-8")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.organization", "1c-syntax")
        property("sonar.projectKey", "1c-syntax_sonar-l10n-ru")
        property("sonar.projectName", "Russian Pack for SonarQube")
        property("sonar.coverage.jacoco.xmlReportPaths", "$buildDir/reports/jacoco/test/jacoco.xml")
    }
}
