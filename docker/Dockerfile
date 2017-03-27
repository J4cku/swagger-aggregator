FROM java:8-jre
ARG GIT_COMMIT=unknown
LABEL git-commit=$GIT_COMMIT
RUN mkdir /swagger
WORKDIR swagger

ADD swagger.jar app.jar
RUN bash -c 'touch app.jar'
EXPOSE 8080
USER nobody

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar", "App.class"]