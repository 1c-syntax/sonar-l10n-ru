#!/usr/bin/env bash

./gradlew clean build
 
docker stop sq-develop || true
docker rm sq-develop || true
docker run -d --name=sq-develop -p 9000:9000 sonarqube:7.9.3-community
docker cp ./build/libs/*.jar sq-develop:/opt/sonarqube/extensions/plugins/
docker start sq-develop
