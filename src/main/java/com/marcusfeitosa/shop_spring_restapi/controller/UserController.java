package com.marcusfeitosa.shop_spring_restapi.controller;

import com.marcusfeitosa.shop_spring_restapi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get")
    public ResponseEntity<User> findAll(){
       User u = new User(
               1L,
               "Maria",
               "maria@gmail.com",
               "9999999",
               "12345"
       );
       return ResponseEntity.ok().body(u);
    }
}
