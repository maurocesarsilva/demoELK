FROM openjdk:17

COPY /target/demoELK-1.0.0.jar /app/app.jar
COPY /elastic-apm-agent-java.jar /app/

WORKDIR /app

CMD ["java","-javaagent:elastic-apm-agent-java.jar", "-jar", "app.jar"]
