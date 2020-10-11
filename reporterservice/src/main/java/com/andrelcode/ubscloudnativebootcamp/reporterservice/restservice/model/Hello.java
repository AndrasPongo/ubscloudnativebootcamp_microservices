package com.andrelcode.ubscloudnativebootcamp.reporterservice.restservice.model;

public class Hello {
    private final long id;
    private final String content;

    public Hello(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getID() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }

}
