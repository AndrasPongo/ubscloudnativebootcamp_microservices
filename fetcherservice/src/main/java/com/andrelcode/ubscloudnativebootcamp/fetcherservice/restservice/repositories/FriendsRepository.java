package com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.repositories;

import com.andrelcode.ubscloudnativebootcamp.fetcherservice.restservice.models.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends JpaRepository<Friend, Integer> {
}
