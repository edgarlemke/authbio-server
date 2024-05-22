#!/bin/bash

cd deepface/scripts
./dockerize.sh &
cd ..

cd spring
./gradlew bootRun &
cd ..


