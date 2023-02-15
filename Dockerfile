FROM amazoncorretto:17-alpine
WORKDIR /app
COPY ./target/Seccion2-1.0.0.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Seccion2-1.0.0.jar"]