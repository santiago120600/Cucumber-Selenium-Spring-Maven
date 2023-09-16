# Use an official Maven image as a parent image
FROM maven:3.8.3-openjdk-11-slim

# Set the working directory to /app
WORKDIR /app

# Copy the project's pom.xml and source code to the container
COPY pom.xml .
COPY src src

# Set an environment variable to specify the environment (defaulting to "dev")
# ENV ENVIRONMENT=dev

# Build the Maven project and package it
# RUN mvn clean package
RUN mvn clean install -DskipTests
# RUN mvn clean install -Denvironment=$ENVIRONMENT
# RUN mvn clean package -Denvironment=$ENVIRONMENT


# Entry point for running Selenium tests
# CMD ["mvn","clean","test","-Denvironment=$ENVIRONMENT"]
CMD ["mvn", "test", "-Denvironment=${ENVIRONMENT}"]
