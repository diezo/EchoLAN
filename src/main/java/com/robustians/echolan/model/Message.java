package com.robustians.echolan.model;

public class Message {
    private int type;
    private String content;

    public Message(int type, String content) {
        this.type = type;
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }
}