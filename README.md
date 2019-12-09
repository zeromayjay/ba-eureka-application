# ba-eureka-application
This project contains an eureka-service with two clients connecting to the service. It is written in java and uses spring.

---

#### Starting the eureka-server:

run `mvn install -DskipTests` in the directory with the POM.xml.
In the /target an executable .jar will be created.

run `java -jar <executable.jar>` in the /target directory

The default Port is 8761 for the eureka-server

#### Starting the clients:

run `mvn install -DskipTests` in the directory with the POM.xml.
In the /target an executable .jar will be created.

run `java -jar <executable.jar> --server.port=XXXX` in the /target directory and substitute XXXX with a free port number (e.g. 8081).
