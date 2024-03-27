FROM openjdk:17-alpine
COPY ./target/songs-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch songs-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","songs-0.0.1-SNAPSHOT.jar"]