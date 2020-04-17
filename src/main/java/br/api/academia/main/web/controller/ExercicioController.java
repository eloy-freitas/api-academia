package br.api.academia.main.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.api.academia.main.domain.Exercicio;
import br.api.academia.main.service.ExercicioService;

@Controller
@RequestMapping("/exercicios")
public class ExercicioController {

	@Autowired
	private ExercicioService service;
	
	@PostMapping("/salvar")
	private String salvar(Exercicio exercicio) {
		service.salvar(exercicio);
		return "exercicio/cadastro";
	}
}
