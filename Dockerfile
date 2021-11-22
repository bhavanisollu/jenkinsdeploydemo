FROM openjdk:8
ADD target/jenkinsdeploy.jar jenkinsdeploy.jar
EXPOSE 8080
CMD ["java -jar jenkinsdeploy.jar"]
