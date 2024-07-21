FROM openjdk:17

COPY target/springboot-first-app-0.0.1-SNAPSHOT.jar springboot-first-app.jar

ENTRYPOINT ["java", "-jar", "springboot-first-app.jar"]
