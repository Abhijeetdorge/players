package com.example.players.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.players.model.Player;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayerJpaRepository extends JpaRepository<Player,Long>{
    

}
