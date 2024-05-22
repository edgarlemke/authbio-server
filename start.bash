#!/bin/bash

mkdir -p log/start
./deepface/scripts/dockerize.sh > log/start/deepface-dockerize-stdout 2> log/start/deepface-dockerize-stderr &
./spring/gradlew bootRun > log/start/spring-stdout 2>log/start/spring-stderr &


