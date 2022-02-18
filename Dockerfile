FROM openjdk:8
EXPOSE 8080
ADD target/springboot-githubactions-image.jar springboot-githubactions-image.jar
ENTRYPOINT [ "java","-jar","/springboot-githubactions-image.jar' ]