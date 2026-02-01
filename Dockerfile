# Use Java 17 (best for Spring Boot 3.x)
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the built jar file
COPY target/*.jar app.jar

# Expose port (Render will map $PORT automatically)
EXPOSE 8080

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
