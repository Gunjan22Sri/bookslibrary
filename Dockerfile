FROM openjdk:8
EXPOSE 9090
ADD target/books.jar books.jar
ENTRYPOINT [ "java","-jar","/books.jar" ]

