package br.api.academia.main.domain;

public enum Cor {
	VE(1, "VERDE"), 
	AM(2, "AMARELO"),
	AZ(3, "AZUL");
	
	private int id;
	private String cor;

	private Cor(int id, String cor) {
		this.id = id;
		this.cor = cor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}