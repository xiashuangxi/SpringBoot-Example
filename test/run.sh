#!/bin/sh
cd $(dirname $0)

echo '进入 springboot-main-slave'
cd ../springboot-main-slave
chmod 777 ./gradlew
./gradlew build --scan -s
exit