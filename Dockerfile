# Use the official Tomcat base image
FROM tomcat:9.0-jdk11-openjdk

# Copy the WAR file into the Tomcat webapps directory
COPY target/employee-webapp.war /usr/local/tomcat/webapps/

# Expose Tomcat port
EXPOSE 8080

# Start Tomcat server
CMD ["catalina.sh", "run"]
