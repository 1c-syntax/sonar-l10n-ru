# SonarQube Russian Language Pack

This is the plugin to translate [SonarQube](http://www.sonarqube.org/) web application in Russian.

[![Crowdin](https://d322cqt584bo4o.cloudfront.net/sonar-l10-ru/localized.svg)](https://crowdin.com/project/sonar-l10-ru)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=1c-syntax_sonar-l10n-ru&metric=alert_status)](https://sonarcloud.io/dashboard?id=1c-syntax_sonar-l10n-ru)

Originally created by [SilverBulleters, LLC](https://silverbulleters.org). Now maintained by [1c-syntax community](https://github.com/1c-syntax).
## Releases

### Install via Marketplace

![default](https://cloud.githubusercontent.com/assets/1132840/18093575/fd4abb4a-6ed8-11e6-9662-16133aab406f.PNG)

### Manual download from Releases page

* Check the [Releases](https://github.com/1c-syntax/sonar-l10n-ru/releases) section
* Download `sonar-l10n-ru-plugin-x.x.jar` file
* Copy the `sonar-l10n-ru-plugin-x.x.jar` into extensions dir of the SonarQube like it described in SonarQube docs

### Build it from source

* You must get the source with git client
* run `./gradlew clean build`
* then copy the `build\libs\*.jar` into extensions dir of the SonarQube like it described in SonarQube docs

## Compatibility Matrix

SonarQube              | sonar-l10n-ru 
:---------------------:|:-------------:
10.8/25.01 - __latest__|25.1
10.8/24.12             |10.8
10.7                   |10.7
10.6                   |10.6
10.5                   |10.5      
10.4                   |10.4.1
10.3                   |10.3.1
10.2                   |10.2.2
10.1                   |10.1.1
10.0                   |10.0.1
9.9 **LTS**            |9.9.1

## How activate Russian language ?

SonarQube Platform language pack activation depends on your browser locale. Quote from an official doc:

> Language packs are plugins that change the language of the user interface. They are called based on the language preference set in the user's browser.

* if your browser use `ru_RU` lang as preference - you see russian interface automatically 
* if your browser use a different locale - please change it in a browser, or use extensions - for example
  * Firefox - use this extension https://addons.mozilla.org/ru/firefox/addon/quick-accept-language-switc/

## Contributing

To request a new feature or report a localization bug, please create a new issue in [GitHub Issues](https://github.com/1c-syntax/sonar-l10n-ru/issues).

If you plan to join the localization team, please join us on [CrowdIn Project](https://crowdin.com/project/sonar-l10-ru/ru#)

## For russian spoken people

Чтобы оставить запрос на новую функциональность или сообщить об ошибке локализации, пожалуйста, создайте issue на странице [GitHub Issues](https://github.com/1c-syntax/sonar-l10n-ru/issues).

Если вы хотите принять участие в локализации - вы можете присоединиться к команде локализаторов в рамках проекта [CrowdIn](https://crowdin.com/project/sonar-l10-ru/ru#)

![russian](https://cloud.githubusercontent.com/assets/1132840/18093540/e03b8304-6ed8-11e6-80c7-2a14b967dbc9.PNG)
