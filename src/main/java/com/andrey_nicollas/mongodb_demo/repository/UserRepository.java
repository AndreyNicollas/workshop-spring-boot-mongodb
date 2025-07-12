package com.andrey_nicollas.mongodb_demo.repository;

import com.andrey_nicollas.mongodb_demo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
