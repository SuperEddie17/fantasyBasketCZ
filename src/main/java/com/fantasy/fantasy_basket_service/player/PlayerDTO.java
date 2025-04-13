package com.fantasy.fantasy_basket_service.player;

import lombok.Data;

@Data
public class PlayerDTO {


    private int id;
    private String firstName;
    private String lastName;
    private String team;
    private String country;
    private String birthDate;
    private String position;
    private int value;

}
