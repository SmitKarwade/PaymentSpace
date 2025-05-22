#FROM openjdk:17-jdk-alpine
#
#WORKDIR /app
#
#COPY target/spacego-0.0.1-SNAPSHOT.jar app.jar
#
#EXPOSE 8080
#
#CMD ["java", "-jar", "app.jar"]

# Stage 1: Build the application
FROM maven:3.9.0-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/spacego-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]