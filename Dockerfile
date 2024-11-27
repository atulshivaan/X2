
FROM openjdk:23-jdk AS build





# Copy the source code into the container
COPY . .

# Build the project using Maven, skipping tests for faster builds
RUN mvn clean package -DskipTests

# Run Stage: Use a slim version of the openjdk image for running the app
FROM openjdk:23-jdk-slim



# Copy the built JAR file from the build stage to the run stage
COPY --from=build /app/target/x2.jar x2.jar

# Expose port (optional, if your application listens on a specific port)
EXPOSE 8080

# Run the application using the copied JAR file
CMD ["java", "-jar", "x2.jar"]


