package com.projetoautomacao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoautomacao.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
