FROM openjdk:8
ADD target/jenkinsdeploy.jar jenkinsdeploy.jar
EXPOSE 8080
CMD ["sleep" , "180"]
ENTRYPOINT ["java","-jar","jenkinsdeploy.jar"]

