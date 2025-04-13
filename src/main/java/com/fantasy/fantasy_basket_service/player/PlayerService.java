package com.fantasy.fantasy_basket_service.player;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerMapper playerMapper;
    private final PlayerRepository playerRepository;
  public PlayerEntity createPlayer(PlayerDTO playerDTO){

       PlayerEntity playerEntity = playerMapper.toEntity(playerDTO);

       playerRepository.save(playerEntity);

      return playerEntity;

   }

}
