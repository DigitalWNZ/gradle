FROM tomcat:8.5
RUN mkdir -p /usr/local/tomcat/webapps/testgradle
COPY libs /usr/local/tomcat/webapps/testgradle
ENTRYPOINT ["/usr/local/tomcat/bin/startup.sh"]