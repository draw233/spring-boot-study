FROM openjdk:17-alpine

# Required for starting application up.
RUN apk update && apk add /bin/sh

RUN mkdir -p /opt/app/web
ENV PROJECT_HOME /opt/app/web

COPY target/*.jar $PROJECT_HOME/web.jar

WORKDIR $PROJECT_HOME
EXPOSE 7777
CMD ["java" ,"-jar","./web.jar"]