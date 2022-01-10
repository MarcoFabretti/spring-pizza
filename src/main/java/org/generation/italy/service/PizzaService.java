package org.generation.italy.service;

import java.util.List;
import org.generation.italy.model.Pizza;
import org.generation.italy.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

public class PizzaService {
	
	@Autowired
	private PizzaRepository repository;
	
	public List<Pizza> findAllSortedByRecent(){
		return repository.findAll(Sort.by("name"));
	}	
}
