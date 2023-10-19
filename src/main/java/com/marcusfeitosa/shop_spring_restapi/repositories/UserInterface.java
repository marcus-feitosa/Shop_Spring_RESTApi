package com.marcusfeitosa.shop_spring_restapi.repositories;

import com.marcusfeitosa.shop_spring_restapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserInterface extends JpaRepository<User, Long> {
}
