package com.fantasy.fantasy_basket_service.user;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDTO(UserEntity source);

    CreationUserDto toCreationDto(UserEntity source);

    @Mapping(target = "id", ignore = true)
    UserEntity toCreationEntity(CreationUserDto source);

    UserEntity toEntity(UserDto source);

}
