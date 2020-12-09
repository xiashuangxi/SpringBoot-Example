#!/bin/sh
cd $(dirname $0)

echo '进入 springboot-main-slave'
cd ../springboot-main-slave
chmod 777 ./gradlew
echo '执行 gradlew clean'
# ./gradlew clean
# ret=$?
# if [ $ret -ne 0 ]; then
# exit $ret
# fi

echo '执行 gradlew compileJava'
./gradlew check
ret=$?
if [ $ret -ne 0 ]; then
exit $ret
fi
rm -rf build
exit