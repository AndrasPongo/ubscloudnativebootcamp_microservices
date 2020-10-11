package com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.services;

import com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.models.Friend;
import com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.repositories.FriendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


public class PersistFriendService {
    @Autowired
    private FriendsRepository friendsRepository;

    private static String name;
    private static Integer id;

    public PersistFriendService(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Bean
    public Object persist() {
        Friend friend = new Friend(this.name);
        return friendsRepository.save(friend);
    }
}
