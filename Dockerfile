FROM openjdk:11

WORKDIR /app

COPY target/testcalc.jar testcalc.jar

ENTRYPOINT ["java", "-jar", "testcalc.jar"]
