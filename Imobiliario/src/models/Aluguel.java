package models;
import java.util.ArrayList;
import java.util.Date;

public class Aluguel {
	
	public Aluguel() {
		setCriadoEm(new Date());
	}
	
	private Date criadoEm;
	private Cliente cliente;
	private Corretor corretor;
	private ArrayList<CasaAluguel> casasAluguel;
	
	public ArrayList<CasaAluguel> getCasasAluguel(){
		return casasAluguel;
	}
	public void setCasasAluguel(ArrayList<CasaAluguel> casasAluguel) {
		this.casasAluguel = casasAluguel;
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
