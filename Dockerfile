FROM amazoncorretto:11-alpine-jdk
MAINTAINER Federico
COPY target/federico-0.0.1-SNAPSHOT.jar  federico-app.jar
ENTRYPOINT ["java","-jar","/federico-app.jar"]
