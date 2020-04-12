#!/usr/bin/env bash

export JAVA_HOME_8=~/.sdkman/candidates/java/8.0.242.hs-adpt
export JAVA_HOME_14=~/.sdkman/candidates/java/14.0.0.hs-adpt
mvn clean verify --global-toolchains toolchains.xml
