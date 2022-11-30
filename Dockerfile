
FROM openjdk:17
EXPOSE 8082
ADD target/jpacrud.jar jpacrud.jar 
ENTRYPOINT ["java","-jar","/jpacrud.jar"]