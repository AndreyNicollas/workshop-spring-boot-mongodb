package com.andrey_nicollas.mongodb_demo.services;

import com.andrey_nicollas.mongodb_demo.domain.User;
import com.andrey_nicollas.mongodb_demo.dto.UserDTO;
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

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

    public User update(User obj) {
        User newUser = repository.findById(obj.getId()).orElseThrow(() -> new ObjectNotFoundException("Erro."));
        updateData(newUser, obj);
        return repository.save(newUser);
    }

    private void updateData(User newUser, User obj) {
        newUser.setName(obj.getName());
        newUser.setEmail(obj.getEmail());
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
