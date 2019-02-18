FROM openjdk:8-jre-slim
MAINTAINER Danny Van Dijck <danny.vandijck@hotmail.com>
VOLUME /tmp
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.essers.hello.HelloApplication"]
EXPOSE 8081
