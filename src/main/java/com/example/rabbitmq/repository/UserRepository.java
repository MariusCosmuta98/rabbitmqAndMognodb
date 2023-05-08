package com.example.rabbitmq.repository;

import com.example.rabbitmq.classes.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
}
