package com.andrelcode.ubscloudnativebootcamp.reporterservice.restservice.controller;

import com.andrelcode.ubscloudnativebootcamp.reporterservice.restservice.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ReporterController {

    private final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "Cloud") String name) {
           return new Hello(counter.incrementAndGet(), String.format(template, name));
    }
}
