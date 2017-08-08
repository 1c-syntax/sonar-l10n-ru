# SonarQube Russian Language Pack

This is the plugin to translate [SonarQube](http://www.sonarqube.org/) web application in Russian.

[![Crowdin](https://d322cqt584bo4o.cloudfront.net/sonar-l10-ru/localized.svg)](https://crowdin.com/project/sonar-l10-ru)
[![Quality Gate](https://sonarqube.com/api/badges/gate?key=org.sonarqube.l10n.ru:sonar-l10n-ru-plugin)](https://sonarqube.com/dashboard/index/org.sonarqube.l10n.ru:sonar-l10n-ru-plugin)
[![Quality Gate](https://sonarqube.com/api/badges/measure?key=org.sonarqube.l10n.ru:sonar-l10n-ru-plugin&metric=coverage)](https://sonarqube.com/dashboard/index/org.sonarqube.l10n.ru:sonar-l10n-ru-plugin)

Direct Plugin Chat   | SonarQube-Russian-Chat |
:-------------------:|:----------------------:|
[![Gitter Chat https://gitter.im/silverbulleters/sonar-l10n-ru](https://badges.gitter.im/Join-Chat.svg)](https://gitter.im/silverbulleters/sonar-l10n-ru)            | [![Gitter Chat https://gitter.im/sonarqube-ru/public](https://badges.gitter.im/Join-Chat.svg)](https://gitter.im/sonarqube-ru/public)           |



## Releases

### Install via Update Center

![default](https://cloud.githubusercontent.com/assets/1132840/18093575/fd4abb4a-6ed8-11e6-9662-16133aab406f.PNG)

### Manual download from Releases page

* Check the [Releases](https://github.com/silverbulleters/sonar-l10n-ru/releases) section
* Download `sonar-l10n-ru-plugin-x.x.jar` file
* Copy the `sonar-l10n-ru-plugin-x.x.jar` into extensions dir of the SonarQube like it described in SonarQube docs

### Build it from source

* You must get the source with git client
* run `mvn clean package` (Maven must be in your path)
* then copy the `target\*.jar` into extensions dir of the SonarQube like it described in SonarQube docs

## Compatibility Matrix
SonarQube     | 5.6.x (LTS) | 6.0 | 6.1 | 6.2 | 6.3 | 6.4 | 6.5 |
:------------:|:-----------:|:---:|:---:|:---:|:---:|:---:|:---:|
sonar-l10n-ru | 1.0         | 1.1 | 1.2 | 1.3 | 1.4 | 1.5 | 1.6 |

## Have questions or feedback?

Have question or feedback? To provide feedback (request a feature, report a bug etc.) use the [Gitter Chat](https://gitter.im/silverbulleters/sonar-l10n-ru)). Please do not forget to specify the language pack (Russian!), plugin version and SonarQube version.
If you have a question on how to use plugin, direct it to [StackOverflow](http://stackoverflow.com/questions/tagged/sonarqube) tagged `sonarqube`.

## Contributing

#### Topic in SonarQube Google Group

To request a new feature, please create a new issue in [GitHub Issues](https://github.com/silverbulleters/sonar-l10n-ru/issues). 
Even if you plan to implement it yourself and submit it back to the community, please start a new issue first to be sure that we can use it.
If you plan to join the localization team, please join us on [CrowdIn Project](https://crowdin.com/project/sonar-l10-ru/ru#)

#### Pull Request (PR)

To submit a contribution, create a pull request for this repository. Please make sure that you follow our [code style](https://github.com/SonarSource/sonar-developer-toolset#code-style) and all [tests](#testing) are passing (Jenkins build is created for each PR).

## Structure

* This plugin [based on structure of French Lang Pack](https://github.com/SonarQubeCommunity/sonar-l10n-fr)
* For contributing please use docker container to visual check of localization - use `rebuild-and-restart.sh` script for this

## For Russian Spoken People

Этот плагин используется для локализации продукта SonarQube при внедрении процесса контроля качества 1С решений. Плагин для контроля 1С систем является платным - за подробностями обращайтесь по адресу `b2b@silverbulleters.org`

Если вы хотите принять участие в локализации - вы можете присоединиться к команде локализаторов в рамках проекта [CrowdIn](https://crowdin.com/project/sonar-l10-ru/ru#)

![russian](https://cloud.githubusercontent.com/assets/1132840/18093540/e03b8304-6ed8-11e6-80c7-2a14b967dbc9.PNG)
