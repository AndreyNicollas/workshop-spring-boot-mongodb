package com.andrey_nicollas.mongodb_demo.resources;

import com.andrey_nicollas.mongodb_demo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User user1 = new User("1", "Andrey Nicollas", "andrey@gmail.com");
        User user2= new User("2", "Carlos Eduardo", "eduardo@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(user1, user2));

        return ResponseEntity.ok().body(list);
    }
}
