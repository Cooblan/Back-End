FROM amazoncorretto:11-alpine-jdk
MAINTAINER Federico
COPY target/federico-0.0.1-SNAPSHOT  federico-app.jar
ENTRYPOINT ["java","-jar","/federico-app.jar"]
