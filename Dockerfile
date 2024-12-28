FROM eclipse-temurin:17
COPY target/devo.jar devo.jar
CMD [ ""java","-java",devo.jar" ]