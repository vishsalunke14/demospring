FROM maven:3.5.4-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:21-jdk-slim
COPY --from=build /target/myfirstproject-0.0.1-SNAPSHOT.jar myfirstproject.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "myfirstproject.jar"]