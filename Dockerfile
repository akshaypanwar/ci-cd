# Use an official OpenJDK runtime as base
FROM eclipse-temurin:21-jre

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file from your local target folder into the container
COPY target/*.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
