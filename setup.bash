#!/bin/bash

# This is the main setup script for getting a running web server instance

apt update
apt full-upgrade --yes

apt install sudo mariadb-server --yes

./setup-docker.bash

# For dockerizing deepface and speed up initialization
# cd deepface/scripts/
# chmod +x ./dockerize.sh
# ./dockerize.sh

# setup node.js
curl -fsSL https://deb.nodesource.com/setup_20.x | sudo bash -
apt install nodejs --yes

# install degit
# npm install -g degit

# create svelte app
# npx degit sveltejs/template view/svelte
#cd view/svelte
#npm install
#cd ../..
