package com.fantasy.fantasy_basket_service.player;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerMapper playerMapper;
    private final PlayerRepository playerRepository;
  public PlayerEntity createPlayer(PlayerDto playerDto){

       PlayerEntity playerEntity = playerMapper.toEntity(playerDto);

       playerRepository.save(playerEntity);

      return playerEntity;

   }
    public void deletePlayer(int id){

      playerRepository.delete(playerRepository.findById(id));

    }
}
