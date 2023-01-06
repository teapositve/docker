FROM openjdk:11
EXPOSE 8081
ADD target/docker.jar docker.jar
ENTRYPOINT ["java", "-jar", "/docker.jar"]