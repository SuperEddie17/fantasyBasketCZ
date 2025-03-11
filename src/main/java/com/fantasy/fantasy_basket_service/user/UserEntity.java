package com.fantasy.fantasy_basket_service.user;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
public class UserEntity {

    @Id
    private Long id;
    private String email;
    private String name;
    private int budget;

}
