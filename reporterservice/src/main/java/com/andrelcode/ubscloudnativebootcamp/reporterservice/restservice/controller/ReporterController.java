package com.andrelcode.ubscloudnativebootcamp.reporterservice.restservice.controller;

import com.andrelcode.ubscloudnativebootcamp.reporterservice.restservice.model.Friend;
import com.andrelcode.ubscloudnativebootcamp.reporterservice.restservice.model.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ReporterController {


    private final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "Cloud") String name) {
           return new Hello(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/hellofriends")
    public Flux helloFriends() {
        WebClient webClient = WebClient.create("http://localhost:8091");
        Flux allFriends = webClient.get().uri("http://localhost:8091/friends").retrieve().bodyToFlux(Friend.class);
        System.out.println("");

        return allFriends;
    }


}
