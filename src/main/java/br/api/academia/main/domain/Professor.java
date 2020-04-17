package br.api.academia.main.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "PROFESSORES")
public class Professor extends Pessoa{

	@Column(name = "matricula", nullable = false, length = 60)
	private String matricula;
	
	@Column(name = "formacao", nullable = false, length = 60)
	private String formacao;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
