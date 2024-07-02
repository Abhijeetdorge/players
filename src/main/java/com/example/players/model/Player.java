package com.example.players.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playerid")
    private long playerId;

    @Column(name = "playername")
    private String playerName;

    @Column(name ="playerrole")
    private String playerRole;


}
