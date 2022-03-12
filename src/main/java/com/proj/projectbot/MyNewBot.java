package com.proj.projectbot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyNewBot extends TelegramLongPollingBot {

    private static final String TOKEN ="5204053070:AAEe_zqvRYhQFNlKUQHgnJxdziH0Znu-m_w";
    private static final String USERNAME = "checkMynew_bot";

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    @Override
    public String getBotUsername() {
        return USERNAME;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if(update.getMessage() != null && update.getMessage().hasText()) {
            long chat_id = update.getMessage().getChatId();

            try {
                execute(new SendMessage(String.valueOf(chat_id), "Hi " + update.getMessage().getText()));
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
