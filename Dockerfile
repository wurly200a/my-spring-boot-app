FROM eclipse-temurin:17.0.10_7-jdk
EXPOSE 8080
COPY target/my-spring-boot-app-0.0.1-SNAPSHOT.jar my-spring-boot-app.jar

RUN adduser -u 1000 wurly
USER wurly

ENV JAVA_OPTS=""

ENTRYPOINT exec java $JAVA_OPTS -jar my-spring-boot-app.jar
