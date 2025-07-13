package com.andrey_nicollas.mongodb_demo.services;

import com.andrey_nicollas.mongodb_demo.domain.Post;
import com.andrey_nicollas.mongodb_demo.repository.PostRepository;
import com.andrey_nicollas.mongodb_demo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Post user = postRepository.findById(id)
                .orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado!"));
        return user;
    }

    public List<Post> findByTitle(String text) {
        return postRepository.searchTitle(text);
    }
}
