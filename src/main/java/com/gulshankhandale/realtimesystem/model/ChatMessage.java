package com.gulshankhandale.realtimesystem.model;


public class ChatMessage {
    private String content;
    private String sender;
    private MessageType type;

    public ChatMessage(){}

    public ChatMessage(String content, String sender, MessageType type){
        this.content = content;
        this.sender = sender;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public MessageType getType() {
        return type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}
