FROM openjdk:17-oracle
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=TestTelegramBot
ENV BOT_TOKEN=1375780501:AAE4A6Rz0BSnIGzeu896OjQnjzsMEG6_uso
ENV BOT_DB_USERNAME=jrtb_db_user
ENV BOT_DB_PASSWORD=jrtb_db_password
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dspring.datasource.username=${BOT_DB_USERNAME}","-Dspring.datasource.password=${BOT_DB_PASSWORD}","-Dbot.username=${BOT_NAME}","-Dbot.token=${BOT_TOKEN}","-jar","app.jar"]