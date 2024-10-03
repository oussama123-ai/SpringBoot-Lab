FROM openjdk:18-ea
WORKDIR /
EXPOSE 8080
COPY ./banking-0.0.1-SNAPSHOT.jar /banking-app.jar
CMD ["java","-jar","banking-app.jar"]
