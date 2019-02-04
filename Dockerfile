FROM openjdk
MAINTAINER Danny Van Dijck <danny.vandijck@hotmail.com>
ADD target/hello.jar hello.jar
ENTRYPOINT ["java", "-jar", "/hello.jar"]
EXPOSE 8099:9999