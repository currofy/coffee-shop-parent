#!/usr/bin/env bash

export JAVA_HOME_11=~/.sdkman/candidates/java/11.0.11.hs-adpt
export JAVA_HOME_17=~/.sdkman/candidates/java/17.0.1-tem
mvn clean verify --global-toolchains toolchains.xml
