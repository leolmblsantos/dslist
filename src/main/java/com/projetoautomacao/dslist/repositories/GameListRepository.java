package com.projetoautomacao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoautomacao.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
	

}
