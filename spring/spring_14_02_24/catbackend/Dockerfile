FROM openjdk:17-alpine
COPY ./target/catbackend-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch catbackend-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","catbackend-0.0.1-SNAPSHOT.jar"]
