#!/bin/sh
cd $(dirname $0)
cd ../springboot-main-slave

./gradlew clean
ret=$?
if [ $ret -ne 0 ]; then
exit $ret
fi

./gradlew compileJava
ret=$?
if [ $ret -ne 0 ]; then
exit $ret
fi

exit