FROM amazoncorretto:17

COPY . /app

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]