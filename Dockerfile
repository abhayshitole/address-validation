FROM openjdk:8
EXPOSE 8080
RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz
RUN mkdir -p /home/app
COPY target/masterdatamanagement.jar /home/app
ENTRYPOINT ["java","-jar","/home/app/masterdatamanagement.jar"]
