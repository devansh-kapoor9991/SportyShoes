FROM openjdk:8-jdk
COPY ./target/producer-ecom-webservice-0.0.1-SNAPSHOT.jar producer-ecom-webservice-0.0.1-SNAPSHOT.jar
CMD ["java" ,"-jar"," producer-ecom-webservice-0.0.1-SNAPSHOT.jar"]
RUN echo "jenkins ALL=(ALL) NOPASSWD: ALL" >> /etc/sudoers
