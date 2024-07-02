package com.example.players.repository;

import com.example.players.model.Player;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface PlayerRepository{
     ArrayList<Player> getAllPlayers();
     Optional<Player> getPlayerById(Long id);
     Player createPlayer(Player player);
     Optional<Player> updatePlayer(Long id, Player playerDetails);
     boolean deletePlayer(Long id);

}