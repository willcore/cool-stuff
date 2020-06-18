# Docker File for Linked List Reversal API
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
# Running container as nobody - no root running here
USER 99
ENTRYPOINT ["java","-jar","/app.jar"]