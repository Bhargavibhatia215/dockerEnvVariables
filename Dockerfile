FROM openjdk:11
EXPOSE 8080
ENV DISPLAY_MESSAGE=This_message_is_present_in_env_variable
ADD target/dockerEnvVariables-0.0.1-SNAPSHOT.jar dockerdemo
ENTRYPOINT ["java","-jar","/dockerdemo"]