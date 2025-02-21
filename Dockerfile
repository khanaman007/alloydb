FROM openjdk:17-jdk-alpine
COPY target/demo-Alloy-db-0.0.1-SNAPSHOT.jar alloydb.jar
ENTRYPOINT ["java", "-jar", "/alloydb.jar"]