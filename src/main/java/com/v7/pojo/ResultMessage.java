package com.v7.pojo;


//用户间传送的消息
public class ResultMessage {
    private boolean isSystem;
    private String fromName;
    //private String toName;
    private Object message;

    public boolean isSystem() {
        return isSystem;
    }

    public void setSystem(boolean system) {
        isSystem = system;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
