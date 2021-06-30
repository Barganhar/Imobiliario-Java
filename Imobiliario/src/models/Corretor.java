package models;

import java.util.Date;

public class Corretor {

	public Corretor() {
		this.criadoEm = new Date();
	}

	private String nome;
	private String cpf;
	private Date criadoEm;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | CPF: " + cpf + "| Criado em: " + criadoEm +"\n";
	}
}
