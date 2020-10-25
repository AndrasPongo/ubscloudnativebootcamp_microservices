package com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.controller;

import com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.models.Friend;
import com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FetchController {

    @Value("${test.testparam}")
    private String test;

    @Autowired
    FriendsRepository friendsRepository;

    @PostMapping(path="/friends", consumes = "application/json", produces = "application/json")
    public Friend createSupportTeamMember(@RequestBody Friend friend) {
        return friendsRepository.save(friend);
    }

    @GetMapping("/friends")
    public List<Friend> all() {
        return friendsRepository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        return test;
    }
}

