FROM openjdk:11

ADD target/testcalc.jar testcalc.jar

ENTRYPOINT ["java","-jar","testcalc.jar"]

