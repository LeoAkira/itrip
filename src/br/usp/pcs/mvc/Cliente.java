package br.usp.pcs.mvc;
import java.time.LocalDate;

public class Cliente {
	private String nome;
	private LocalDate nascimento;
	private int cpf;
	private int rg;
	private String endereco;
	private int passaporte;
	private String email;
	private int telefone;
	
	public Cliente(String nome, LocalDate nascimento, int cpf, int rg, String endereco, int passaporte, String email, int telefone) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.passaporte = passaporte;
		this.email = email;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(int passaporte) {
		this.passaporte = passaporte;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
}
