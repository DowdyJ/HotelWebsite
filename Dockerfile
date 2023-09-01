FROM openjdk:17-oracle
RUN mkdir /opt/app
COPY "target/D387_sample_code-0.0.2-SNAPSHOT.jar" /opt/app
EXPOSE 8080
CMD ["java", "-jar", "/opt/app/D387_sample_code-0.0.2-SNAPSHOT.jar"]