FROM openjdk:8
EXPOSE 8080
ADD target/fashionblog-images.jar fashionblog-images.jar
ENTRYPOINT ["java", "-jar", "fashionblog-images.jar"]
