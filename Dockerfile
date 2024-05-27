FROM openjdk:11
EXPOSE 8080
ENV DISPLAY_MESSAGE=This message is present in env variable
ADD target/dockerDemo-0.0.1-SNAPSHOT.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","/dockerdemo.jar"]