package models;
import java.util.Date;

public class Casa {
	
	public Casa() {
		setCriadoEm(new Date());
	}
	
	public Casa(String nome, String endereco, String cep, double valor, String corretor) {
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.valor = valor;
		this.corretor = corretor;
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

	public String getCorretor() {
		return corretor;
	}

	public void setCorretor(String corretor) {
		this.corretor = corretor;
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
	private String corretor;	
	private Date criadoEm;

	@Override
	public String toString() {
		return "Nome: " + nome + " | Endereço: " + endereco + " | Cep: " + cep + " | Valor: " + valor + " | Corretor: " + corretor + " |  Criado em: " + criadoEm;
	}
	
}
