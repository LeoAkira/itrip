package br.usp.pcs.mvc;

public class Hotel {
	private String id;
	private String nome;
	private Double precoDiaria;
	private String endereco;
	
	public Hotel(String id, String nome, Double precoDiaria, String endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.precoDiaria = precoDiaria;
		this.endereco = endereco;
	}
	
	public String getId() {
		return id;
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
	public Double getPrecoDiaria() {
		return precoDiaria;
	}
	public void setPrecoDiaria(Double precoDiaria) {
		this.precoDiaria = precoDiaria;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
