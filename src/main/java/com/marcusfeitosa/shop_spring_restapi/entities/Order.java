package com.marcusfeitosa.shop_spring_restapi.entities;

import lombok.*;

import java.time.Instant;
@Getter
public class Order {
    private Long id;
    private Instant moment;
    private User client;

}
