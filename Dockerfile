FROM eclipse-temurin:17-jdk-alpine

# Install Maven
RUN apk add --no-cache maven

WORKDIR /app

COPY pom.xml .
COPY src src

# Build the application
RUN mvn clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/D387_sample_code-0.0.2-SNAPSHOT.jar"]

