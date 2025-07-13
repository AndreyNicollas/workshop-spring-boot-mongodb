package com.andrey_nicollas.mongodb_demo.services;

import com.andrey_nicollas.mongodb_demo.domain.User;
import com.andrey_nicollas.mongodb_demo.repository.UserRepository;
import com.andrey_nicollas.mongodb_demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        User user = repository.findById(id)
                .orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado!"));
        return user;
    }
}
