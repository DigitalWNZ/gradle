FROM tomcat:8.5
RUN rm -rf /usr/local/tomcat/webapps
RUN mkdir -p /usr/local/tomcat/webapps/testgradle
COPY libs /usr/local/tomcat/webapps/testgradle
ENTRYPOINT ["/usr/local/tomcat/bin/startup.sh"]