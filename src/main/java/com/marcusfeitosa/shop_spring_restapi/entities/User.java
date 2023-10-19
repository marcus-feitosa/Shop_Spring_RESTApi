package com.marcusfeitosa.shop_spring_restapi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode

public class User  {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
}
