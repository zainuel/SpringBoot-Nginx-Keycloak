FROM openjdk:alpine

COPY /target/ngnix-demo-0.0.1-SNAPSHOT.jar  .

ENTRYPOINT ["java","-jar","ngnix-demo-0.0.1-SNAPSHOT.jar"]
