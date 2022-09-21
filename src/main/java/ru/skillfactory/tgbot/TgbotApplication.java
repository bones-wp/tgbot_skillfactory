package ru.skillfactory.tgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling //разрешает запуск задач по расписанию
public class TgbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(TgbotApplication.class, args);
	}

}
