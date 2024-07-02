package com.example.players.service;

import com.example.players.model.Player;
import com.example.players.repository.PlayerRepository;
import com.example.players.repository.PlayerJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService implements PlayerRepository {
  
    @Autowired
    private PlayerJpaRepository playerRepository;

    @Override
    public ArrayList<Player> getAllPlayers() {
        List<Player> playerList = playerRepository.findAll();
        return new ArrayList<>(playerList);
    }

    @Override
    public Optional<Player> getPlayerById(Long id) {
        return playerRepository.findById(id);
    }

    @Override
    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Optional<Player> updatePlayer(Long id, Player playerDetails) {
        return playerRepository.findById(id).map(player -> {
            player.setPlayerName(playerDetails.getPlayerName());
            player.setPlayerRole(playerDetails.getPlayerRole());
            return playerRepository.save(player);
        });
    }

    @Override
    public boolean deletePlayer(Long id) {
        return playerRepository.findById(id).map(player -> {
            playerRepository.delete(player);
            return true;
        }).orElse(false);
    }
}
