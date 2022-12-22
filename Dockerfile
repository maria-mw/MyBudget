FROM openjdk:18-jdk-alpine
ARG JAR_FILE=target/EasyWebBudget-0.0.1-SNAPSHOT.war
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]