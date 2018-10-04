package com.johncharles.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johncharles.cursomc.domain.Categoria;
import com.johncharles.cursomc.repositories.CategoriaRepository;
import com.johncharles.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("objeto não encontrado! Id:" + id
					+ ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}

}
