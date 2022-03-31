package com.insideclub.telegrambot.entity;


public class Bot {

    private final String BOT_NAME;
    private final String BOT_TOKEN;

    private final NonCommand nonCommand;

    public Bot(String bot_name, String bot_token, NonCommand nonCommand) {
        BOT_NAME = bot_name;
        BOT_TOKEN = bot_token;
        this.nonCommand = nonCommand;

    }

}
