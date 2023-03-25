FROM openjdk:17-oracle
ADD target/devsu-2.2.0-SNAPSHOT.jar devsu-2.2.0-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","devsu-2.2.0-SNAPSHOT.jar" ]