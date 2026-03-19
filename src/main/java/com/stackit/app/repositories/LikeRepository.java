package com.stackit.app.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.stackit.app.models.Like;

@Repository
public interface LikeRepository extends ReactiveMongoRepository<Like, String> {
    
}
