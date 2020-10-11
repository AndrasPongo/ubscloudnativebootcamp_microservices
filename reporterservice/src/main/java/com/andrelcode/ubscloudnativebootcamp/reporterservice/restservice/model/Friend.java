package com.andrelcode.ubscloudnativebootcamp.reporterservice.restservice.model;

public class Friend {
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private Integer id;
    private String name;

    public Friend() {};

    public Friend(String name) {
        super();
        this.name = name;
    }
}
