FROM openjdk:17-oracle
ARG JAR_FILE=target/*.jar
ENV BOT_NAME=TestTelegramBot
ENV BOT_TOKEN=5609401876:AAH94ba-xFry3Ipc4HIX4zV4CKKnL6463WM
ENV BOT_DB_USERNAME=jrtb_db_user
ENV BOT_DB_PASSWORD=jrtb_db_password
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dspring.datasource.password=${BOT_DB_PASSWORD}", "-Dbot.username=${BOT_NAME}","-Dbot.token=${BOT_TOKEN}", "-Dspring.datasource.username=${BOT_DB_USERNAME}", "-jar", "app.jar"]