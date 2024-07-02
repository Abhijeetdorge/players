package com.example.players.controller;

import com.example.players.model.Player;
import com.example.players.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class PlayerController {
    @Autowired
    public PlayerService playerService;

    @GetMapping("/players")
    public ArrayList<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @GetMapping("/players/{id}")
    public Optional<Player> getPlayerById(@PathVariable Long id) {
        return playerService.getPlayerById(id);
    }

    @PostMapping("/players")
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    @PutMapping("/players/{id}")
    public Optional<Player> updatePlayer(@PathVariable Long id, @RequestBody Player playerDetails) {
        return playerService.updatePlayer(id, playerDetails);
    }

    @DeleteMapping("/players/{id}")
    public boolean deletePlayer(@PathVariable Long id) {
        return playerService.deletePlayer(id);
    }
}
