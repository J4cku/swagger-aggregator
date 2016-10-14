FROM java:8-jre
RUN mkdir /swagger
WORKDIR swagger

ADD swagger.jar app.jar
RUN bash -c 'touch app.jar'
EXPOSE 8080
USER nobody

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar", "App.class"]