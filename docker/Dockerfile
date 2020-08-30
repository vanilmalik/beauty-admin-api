FROM openjdk:8

ENV JAVA_OPTS="-Dspring.profiles.active=dockerlocal -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8888"

ARG JAR_FILE=beauty-admin-api.jar

ADD ${JAR_FILE} application.jar

EXPOSE 8181 8888

CMD java -jar ${JAVA_OPTS} /application.jar