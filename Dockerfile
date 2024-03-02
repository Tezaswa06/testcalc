FROM openjdk:17

ADD target/testcalc.jar testcalc.jar

ENTRYPOINT ["java","-jar","testcalc.jar"]

