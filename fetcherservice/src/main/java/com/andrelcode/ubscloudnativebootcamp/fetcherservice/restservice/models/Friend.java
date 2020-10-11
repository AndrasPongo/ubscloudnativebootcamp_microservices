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
}
