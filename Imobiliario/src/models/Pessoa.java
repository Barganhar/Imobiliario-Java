package models;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String email;
	private Float salario;
	private String garantia;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getSalario() {
		return salario;
	}
	public void setSalario(Float salario) {
		this.salario = salario;
	}
	public String getGarantia() {
		return garantia;
	}
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	

	@Override
	public String toString() {
		return "Nome: " + nome + " | CPF: " + cpf + " | Email: " + email + " | Salario: " + salario + " | Garantia: " + garantia;
	}

}