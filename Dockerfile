FROM openjdk:17-oracle
ADD target/devsu-0.0.1-SNAPSHOT.jar devsu-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","devsu-0.0.1-SNAPSHOT.jar" ]