package com.fantasy.fantasy_basket_service.user;


import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDTO(UserEntity source);

    CreationUserDto toCreationDto(UserEntity source);


    UserEntity toCreationEntity(CreationUserDto source);

    UserEntity toEntity(UserDto source);

}
