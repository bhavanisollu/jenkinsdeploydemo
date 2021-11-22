FROM openjdk:8
ADD target/jenkinsdeploy.jar jenkinsdeploy.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/jenkinsdeploy.jar"]
CMD ["echo" , "command in cmd instruction in docker file.."]
