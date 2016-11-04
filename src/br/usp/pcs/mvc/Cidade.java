package br.usp.pcs.mvc;

public class Cidade {
	private String nome;
	private boolean temAeroporto;
	private int numeroDiasIdeal;
	private String id;
	
	public Cidade(String id, String nome, boolean temAeroporto, int numeroDiasIdeal){
		super();
		this.nome = nome;
		this.temAeroporto = temAeroporto;
		this.numeroDiasIdeal = numeroDiasIdeal;
		this.id = id;
	}

	public String getId() {
		return this.id;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isTemAeroporto() {
		return temAeroporto;
	}

	public void setTemAeroporto(boolean temAeroporto) {
		this.temAeroporto = temAeroporto;
	}

	public int getNumeroDiasIdeal() {
		return numeroDiasIdeal;
	}

	public void setNumeroDiasIdeal(int numeroDiasIdeal) {
		this.numeroDiasIdeal = numeroDiasIdeal;
	}
	
}

