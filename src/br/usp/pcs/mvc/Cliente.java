package br.usp.pcs.mvc;
import java.util.Date;

public class Cliente {
	private String nome;
	private Date nascimento;
	private int cpf;
	private int rg;
	private String enderešo;
	private int passaporte;
	private String email;
	private int telefone;
	
	public Cliente(String nome, Date nascimento, int cpf, int rg, String enderešo, int passaporte, String email, int telefone) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.enderešo = enderešo;
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
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
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
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
