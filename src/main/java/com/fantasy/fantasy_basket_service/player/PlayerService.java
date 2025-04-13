package com.fantasy.fantasy_basket_service.player;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerMapper playerMapper;

   PlayerEntity createPlayer(PlayerDTO playerDTO){
       PlayerEntity playerEntity = playerMapper.toEntity(playerDTO);


      return null;

   }

}
