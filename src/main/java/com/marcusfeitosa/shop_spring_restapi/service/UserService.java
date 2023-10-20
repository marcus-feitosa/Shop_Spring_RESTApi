package com.marcusfeitosa.shop_spring_restapi.service;

import com.marcusfeitosa.shop_spring_restapi.entities.User;
import com.marcusfeitosa.shop_spring_restapi.repositories.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class UserService {

    @Autowired
    private UserInterface repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}
