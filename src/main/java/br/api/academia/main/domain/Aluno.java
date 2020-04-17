package br.api.academia.main.domain;

import java.math.BigDecimal;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ALUNOS")
public class Aluno extends Pessoa{
	
	@Column(name = "matricula", nullable = false, length = 60)
	private String matricula;
	
	@Column(name = "responsavel", nullable = false, length = 60)
	private String responsavel;
	
	@Column(name = "codigo_promocao", nullable = false, length = 60)
	private String codigoPromocao;
	
	@Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal mensalidade;
	
	@OneToMany(mappedBy = "aluno")
	private List<Exercicio> exercicios;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getCodigoPromocao() {
		return codigoPromocao;
	}
	public void setCodigoPromocao(String codigoPromocao) {
		this.codigoPromocao = codigoPromocao;
	}
	public BigDecimal getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(BigDecimal mensalidade) {
		this.mensalidade = mensalidade;
	}
	public List<Exercicio> getExercicios() {
		return exercicios;
	}
	public void setExercicios(List<Exercicio> exercicios) {
		this.exercicios = exercicios;
	}
	
	
}
