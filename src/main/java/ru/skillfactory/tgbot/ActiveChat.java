package ru.skillfactory.tgbot;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity // Данный класс является JPA сущностью
@Table(name = "ACTIVE_CHAT") //И хранится в таблице ACTIVE_CHAT
public class ActiveChat {

    @Id
    @GeneratedValue
    private Long id; //Уникальный идентификатор в системе нашего бота

    @Column(name = "CHAT_ID")
    private Long chatId; //Уникальный идентификатор в системе Telegram
}
