package models;
import java.util.Date;

public class Cliente {
	
	public Cliente() {
	this.criadoEm = new Date();
	}
	
	private String nome;
	private String cpf;
	private String email;
	private Float salario;
	private Boolean garantia;
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
	public Boolean getGarantia() {
		return garantia;
	}
	public void setGarantia(Boolean garantia) {
		this.garantia = garantia;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | CPF: " + cpf + " | Email: " + email + " | Salario: " + salario + " | Garantia: " + garantia + " | Criado em: " + criadoEm;
	}

}

	
