FROM openjdk:8
VOLUME /tmp
ADD ./target/kubernetes-0.0.1-SNAPSHOT.jar servicio-kubernetes.jar
ENTRYPOINT ["java", "-jar", "/servicio-kubernetes.jar"]