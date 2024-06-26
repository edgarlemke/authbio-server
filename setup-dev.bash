#!/bin/bash

apt update
apt full-upgrade

apt install git vim ctags nmap --yes

sed -i 's/#PermitRootLogin prohibit-password/PermitRootLogin yes/g' /etc/ssh/sshd_config
/etc/init.d/ssh restart

