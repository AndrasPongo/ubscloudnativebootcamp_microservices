package com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.models;

import javax.persistence.*;

@Entity
@Table(name="friends")
public class Friend {
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Integer id;
    private @Column(name = "name") String name;

    public Friend() {};

    public Friend(String name) {
        super();
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
