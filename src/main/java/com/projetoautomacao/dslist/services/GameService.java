package com.projetoautomacao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoautomacao.dslist.dto.GameMinDTO;
import com.projetoautomacao.dslist.entities.Game;
import com.projetoautomacao.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		
		/*pode ser usado das duas formas*/
		
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		//return dto;
		
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
