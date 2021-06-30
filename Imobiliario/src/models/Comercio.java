package models;

public abstract class Comercio {

	private String nome;
	private Casa casa;
	private Double valor;

	public String toString() {
		return toString() + " | Nome: " + nome + " | Casa: " + casa + " | Valor: " + valor;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
