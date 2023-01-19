FROM amazoncorretto:8-alpine-jdk
MAINTAINER federico
COPY target/federico-0.0.1-SNAPSHOT.jar federico-app.jar
ENTRYPOINT ["java","-jar","/mgb-app.jar"]
