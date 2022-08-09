FROM openjdk:13-alpine AS builder
WORKDIR workspace
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} catalog-api.jar
RUN java -Djarmode=layertools -jar catalog-api.jar extract

FROM openjdk:13-alpine
WORKDIR workspace
COPY --from=builder workspace/dependencies/ ./
COPY --from=builder workspace/spring-boot-loader/ ./
COPY --from=builder workspace/snapshot-dependencies/ ./
COPY --from=builder workspace/application/ ./
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher", "--spring.config.location=classpath:/application-docker.yml"]
