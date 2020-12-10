#!/bin/sh
cd $(dirname $0)

cd ../springboot-main-slave
chmod 777 ./gradlew
./gradlew build --continue
# ./gradlew jacocoTestReport coveralls
./gradlew check
# ./gradlew codeCoverageReport
./gradlew jacocoTestReport coveralls

exit