package com.fantasy.fantasy_basket_service.player;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PlayerEntity {
    @Id
    @GeneratedValue(strategy =
    GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private String team;
    private String country;
    private String birthDate;
    private String position;
    private int value;

}
