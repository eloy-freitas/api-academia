package br.api.academia.main.dao;

import java.util.List;

import br.api.academia.main.domain.Aluno;

public interface AlunoDao {
	
	 void save(Aluno aluno);
	 
	 void update(Aluno aluno);
	 
	 void delete(Long id);
	 
	 Aluno findById(Long id);
	
	 List<Aluno> findAll();
}
