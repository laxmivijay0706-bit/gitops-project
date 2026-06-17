# Stage 1: Maven se JAR build karo
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: JRE image mein JAR run karo (17-jre, NOT 17-jre-slim — slim tag exist nahi karta)
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "-Dlogging.level.root=INFO", "app.jar"]
