FROM maven:3.9-eclipse-temurin-17-alpine AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests
FROM gcr.io/distroless/java17-debian11:nonroot
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
USER nonroot:nonroot
EXPOSE 8080
CMD ["app.jar"]


#FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]