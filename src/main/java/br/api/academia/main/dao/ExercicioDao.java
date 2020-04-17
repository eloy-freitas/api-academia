package br.api.academia.main.dao;

import java.util.List;

import br.api.academia.main.domain.Exercicio;

public interface ExercicioDao {

	 void save(Exercicio Exercicio);
	 
	 void update(Exercicio Exercicio);
	 
	 void delete(Long id);
	 
	 Exercicio findById(Long id);
	
	 List<Exercicio> findAll();
}
