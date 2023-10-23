package com.marcusfeitosa.shop_spring_restapi.repositories;

import com.marcusfeitosa.shop_spring_restapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
