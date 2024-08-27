# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY target/trip-feedback-0.0.1-SNAPSHOT.jar /app/trip-feedback.jar

# Make port 7001 available to the world outside this container
EXPOSE 7001

# Run the jar file with the active profile
ENTRYPOINT ["java", "-jar", "trip-feedback.jar", "--spring.profiles.active=${SPRING_PROFILES_ACTIVE}"]
