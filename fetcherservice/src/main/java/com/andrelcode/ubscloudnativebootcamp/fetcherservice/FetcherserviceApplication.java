package com.andrelcode.ubscloudnativebootcamp.fetcherservice;

import com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.repositories.FriendsRepository;
import com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.services.PersistFriendService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FetcherserviceApplication {
	private static PersistFriendService persistFriendService = new PersistFriendService("test", 1);

	public static void main(String[] args) { SpringApplication.run(FetcherserviceApplication.class, args); }



}
