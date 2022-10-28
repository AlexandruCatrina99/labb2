FROM openjdk:17


ARG PROJECT_VERSION
ARG PROJECT_NAME

ADD ${PROJECT_NAME}-${PROJECT_VERSION}.jar /alexandrucatrina/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/alexandrucatrina/app.jar"]