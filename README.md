# SonarQube Russian Language Pack

This is the plugin to translate [SonarQube](http://www.sonarqube.org/) web application in Russian.

[![Gitter Chat https://gitter.im/silverbulleters/sonar-l10n-ru](https://badges.gitter.im/Join Chat.svg)](https://gitter.im/silverbulleters/sonar-l10n-ru?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
[![Crowdin](https://d322cqt584bo4o.cloudfront.net/sonar-l10-ru/localized.svg)](https://crowdin.com/project/sonar-l10-ru)


## Releases

> TODO - publish it in to update center

* You must get the source.
* run `mvn clean package`
* when copy the `target\*.jar` into extensions dir of the SonarQube

## Have questions or feedback?

Have question or feedback? To provide feedback (request a feature, report a bug etc.) use the [Gitter Chat](https://gitter.im/silverbulleters/sonar-l10n-ru)). Please do not forget to specify the language pack (Russian!), plugin version and SonarQube version.
If you have a question on how to use plugin, direct it to [StackOverflow](http://stackoverflow.com/questions/tagged/sonarqube) tagged `sonarqube`.

## Contributing

#### Topic in SonarQube Google Group

To request a new feature, please create a new issue in [GitHub Issues](https://github.com/silverbulleters/sonar-l10n-ru/issues). Even if you plan to implement it yourself and submit it back to the community, please start a new issue first to be sure that we can use it.

#### Pull Request (PR)

To submit a contribution, create a pull request for this repository. Please make sure that you follow our [code style](https://github.com/SonarSource/sonar-developer-toolset#code-style) and all [tests](#testing) are passing (Jenkins build is created for each PR).

## Structure

* This plugin [based on structure of French Lang Pack](https://github.com/SonarQubeCommunity/sonar-l10n-fr)
* For contributing please use docker container to visual check of localization - use `rebuild-and-restart.sh` скрипт for this

## For Russian Spoken People

Этот плагин используется для локализации продукта SonarQube при внедрении процесса контроля качества 1С решений. Плагин для контроля 1С систем является платным - за подробностями обращайтесь по адресу `b2b@silverbulleters.org`
