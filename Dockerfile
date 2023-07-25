FROM ibm-semeru-runtimes:open-11-jre
COPY target/transport-config-server.jar transport-config-server.jar
ENTRYPOINT ["java","-jar","/transport-config-server.jar"]