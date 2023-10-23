package com.marcusfeitosa.shop_spring_restapi.repositories;

import com.marcusfeitosa.shop_spring_restapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
