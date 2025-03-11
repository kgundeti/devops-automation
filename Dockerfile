FROM openjdk:17
ADD target/order.jar order.jar
ENTRYPOINT ["java","-jar","order.jar"]