FROM tomcat:latest
LABEL maintainer="spyrr"

RUN mkdir /usr/local/tomcat/webapps/ROOT
COPY ROOT /usr/local/tomcat/webapps/ROOT

EXPOSE 8080
ENTRYPOINT ["/usr/local/tomcat/bin/catalina.sh", "run"]
