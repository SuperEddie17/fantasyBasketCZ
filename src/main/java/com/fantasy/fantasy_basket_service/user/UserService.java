package com.fantasy.fantasy_basket_service.user;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserMapper userMapper;
   private final UserRepository userRepository;

    public UserDto createUser(CreationUserDto creationUserDto) {
        UserEntity userEntity = userMapper.toCreationEntity(creationUserDto);
        userEntity.setBudget(1000);
        userRepository.save(userEntity);
        UserEntity user =new UserEntity();
        user.setId(userEntity.getId());

        return userMapper.toDTO(userEntity);
    }
}
