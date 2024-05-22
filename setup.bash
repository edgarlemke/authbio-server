#!/bin/bash

apt update
apt full-upgrade

apt install  sudo --yes

./setup-docker.bash
