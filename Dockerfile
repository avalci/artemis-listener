FROM openjdk:11
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/artemis-listener-1.0.0.jar artemislistener.jar
EXPOSE 8081
ENTRYPOINT exec java $JAVA_OPTS -jar artemislistener.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar artemislistener.jar
