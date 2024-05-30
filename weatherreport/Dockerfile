FROM openjdk:17
WORKDIR /app
COPY build/libs/ /app/
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "weatherreport-0.0.1-SNAPSHOT.jar", "--server.port=8082"]