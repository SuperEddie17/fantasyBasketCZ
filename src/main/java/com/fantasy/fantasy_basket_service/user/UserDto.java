package com.fantasy.fantasy_basket_service.user;

import lombok.Data;

@Data
public class UserDto {
    private int id;
    private String email;
    private String name;
    private int age;
    private int budget;

}
