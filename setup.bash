#!/bin/bash

apt update
apt full-upgrade

apt install sudo mariadb-server --yes

./setup-docker.bash

# Para dockerizar o deepface e agilizar a inicialização 
# cd deepface/scripts/
# chmod +x ./dockerize.sh
# ./dockerize.sh
