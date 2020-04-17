package br.api.academia.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.api.academia.main.dao.ExercicioDao;
import br.api.academia.main.domain.Exercicio;

@Service @Transactional(readOnly = false)
public class ExercicioServiceImpl implements ExercicioService {

	@Autowired
	private ExercicioDao dao;
	
	@Override
	public void salvar(Exercicio exercicio) {
		dao.save(exercicio);
	}

	@Override
	public void editar(Exercicio exercicio) {
		dao.update(exercicio);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override @Transactional(readOnly = true)
	public Exercicio buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Exercicio> buscarTodos() {
		
		return dao.findAll();
	}

}
