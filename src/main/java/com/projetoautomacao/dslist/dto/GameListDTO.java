package com.projetoautomacao.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.projetoautomacao.dslist.entities.GameList;

public class GameListDTO {
	private Long id;
	private String name;
	
	public GameListDTO() {
	}

	public GameListDTO(GameList entity) {
		
		//BeanUtils.copyProperties(entity, this); /*Poderia usar assim tbm mas como é poucos dados foi feito de outra forma não usando essa funçção precisa somente dos GETs*/
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
