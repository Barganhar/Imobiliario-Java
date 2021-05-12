package models;
import java.util.Date;

public class Casa {
	
	public Casa() {
		setCriadoEm(new Date());
	}
	
	public Casa(String nome, String endereco, String cep, double valor) {
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.valor = valor;
	}
	
	private String nome;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	private String endereco;
	private String cep;
	private Double valor;
	private Date criadoEm;

	@Override
	public String toString() {
		return "Nome: " + nome + " | Endere�o: " + endereco + " | Cep: " + cep + " | Valor: " + valor  + " |  Criado em: " + criadoEm;
	}
	
}
