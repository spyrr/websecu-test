FROM openjdk:latest
LABEL maintainer="spyrr"

RUN mkdir -p /app
COPY build/libs/books-0.0.1-SNAPSHOT.jar /app/

WORKDIR /app/

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/books-0.0.1-SNAPSHOT.jar"]
