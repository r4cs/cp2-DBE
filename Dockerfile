FROM openjdk:17-alpine

# FROM openjdk:8u111-alpine

RUN apk update

RUN adduser -D usrapp

USER usrapp

WORKDIR usrapp

COPY ../target/demo-0.0.1-SNAPSHOT.jar ./app.jar

EXPOSE 8080
		
CMD ["java", "-jar", "app.jar"]