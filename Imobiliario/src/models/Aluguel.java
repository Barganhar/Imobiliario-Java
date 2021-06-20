package models;

import java.util.Date;

public class Aluguel extends Comercio {

	public Aluguel() {
		setCriadoEm(new Date());
	}

	public Cliente cliente;
	public Casa casa;
	public Corretor corretor;
	public String nome;
	public Date criadoEm;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	public Corretor getCorretor() {
		return corretor;
	}

	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return "\n\nCliente: " + cliente + " | Casa: " + casa + " | Corretor: " + corretor + " | Nome: " + nome;
	}
}
