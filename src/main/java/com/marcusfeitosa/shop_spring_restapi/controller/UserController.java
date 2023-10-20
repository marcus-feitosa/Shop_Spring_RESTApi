package com.marcusfeitosa.shop_spring_restapi.controller;

import com.marcusfeitosa.shop_spring_restapi.entities.User;
import com.marcusfeitosa.shop_spring_restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;
    @GetMapping("/get")
    public ResponseEntity<List<User>> findAll(){
        List<User> u = service.findAll();

       return ResponseEntity.ok().body(u);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
