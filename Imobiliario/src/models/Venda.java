package models;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
	
	public Venda() {
		setCriadoEm(new Date());
	}
	
	private Date criadoEm;
	private Cliente cliente;
	private Corretor corretor;
	private ArrayList<CasaVenda> casasVenda;
	
	public ArrayList<CasaVenda> getCasasVenda(){
		return casasVenda;
	}
	public void setCasasVenda(ArrayList<CasaVenda> casasVenda) {
		this.casasVenda = casasVenda;
	}
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Corretor getCorretor() {
		return corretor;
	}
	public void setCorretor(Corretor corretor) {
		this.corretor = corretor;
	}

}
