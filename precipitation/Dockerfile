FROM openjdk:17
WORKDIR /app
COPY build/libs/ /app/
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "precipitation-0.0.1-SNAPSHOT.jar", "--server.port=8081"]