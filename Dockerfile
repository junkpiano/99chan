FROM openjdk:8-jdk-alpine
MAINTAINER Yusuke Ohashi

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

ARG JAR_VERSION=0.0.1
# The application's jar file
ARG JAR_FILE=build/libs/99chan-${JAR_VERSION}-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} app.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]