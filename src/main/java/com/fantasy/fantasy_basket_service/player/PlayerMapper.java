package com.fantasy.fantasy_basket_service.player;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper {


    PlayerEntity toEntity(PlayerDto source);

}
