package com.marcusfeitosa.shop_spring_restapi.service;

import com.marcusfeitosa.shop_spring_restapi.entities.Order;
import com.marcusfeitosa.shop_spring_restapi.entities.User;
import com.marcusfeitosa.shop_spring_restapi.repositories.OrderRepository;
import com.marcusfeitosa.shop_spring_restapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
