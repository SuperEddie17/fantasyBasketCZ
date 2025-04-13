package com.fantasy.fantasy_basket_service.user;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {


    private final UserService userService;

    @PostMapping("/create")
    public UserDto createUser(@RequestBody @Valid CreationUserDto dto) {
        return userService.createUser(dto);
    }

}
