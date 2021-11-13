FROM openjdk:8-jdk
COPY ./target/ecom-webservice-0.0.1-SNAPSHOT.jar sporty-shoes-0.0.1-SNAPSHOT.jar
CMD ["java" ,"-jar","sporty-shoes-0.0.1-SNAPSHOT.jar"]
RUN echo "jenkins ALL=(ALL) NOPASSWD: ALL" >> /etc/sudoers
