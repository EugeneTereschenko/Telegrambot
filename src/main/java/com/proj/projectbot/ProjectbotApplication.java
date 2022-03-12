package com.proj.projectbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class ProjectbotApplication {

    public static void main(String[] args) throws TelegramApiException {

    TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);

    MyNewBot myNewBot = new MyNewBot();
    try {
        telegramBotsApi.registerBot(myNewBot);
    } catch (Exception e) {
        e.printStackTrace();
    }

    SpringApplication.run(ProjectbotApplication.class, args);
    }

}
