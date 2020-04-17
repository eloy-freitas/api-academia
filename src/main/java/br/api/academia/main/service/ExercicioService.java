package br.api.academia.main.service;

import java.util.List;

import br.api.academia.main.domain.Exercicio;

public interface ExercicioService {

	void salvar(Exercicio exercicio);
	
	void editar(Exercicio exercicio);
	
	void excluir(Long id);
	
	Exercicio buscarPorId(Long id);
	
	List<Exercicio> buscarTodos();
}
