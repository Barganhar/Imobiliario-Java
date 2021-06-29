package models;

public abstract class Comercio {

	private String nome;
	private Casa casa;

	public String toString() {
		return toString() + " | Nome: " + nome + " | Casa: " + casa;
	};

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

}
