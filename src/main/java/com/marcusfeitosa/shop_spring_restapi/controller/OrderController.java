package com.marcusfeitosa.shop_spring_restapi.controller;

import com.marcusfeitosa.shop_spring_restapi.entities.Order;
import com.marcusfeitosa.shop_spring_restapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService service;
    @GetMapping("/get")
    public ResponseEntity<List<Order>> findAll(){
        List<Order> u = service.findAll();

       return ResponseEntity.ok().body(u);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
