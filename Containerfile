FROM registry.access.redhat.com/ubi8/openjdk-11-runtime:1.14-6

COPY target/spring-quickstart-0.0.1-SNAPSHOT.jar /deployments/spring-quickstart-0.0.1-SNAPSHOT.jar
