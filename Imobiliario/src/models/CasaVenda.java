package models;
import java.util.Date;

public class CasaVenda {
	
	public CasaVenda() {
		setCriadoEm(new Date());
	}

	private Casa casa;
	private Double valor;
	private Date criadoEm;
	
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
	public Date getCriadoEm() {
		return criadoEm;
	}
	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	
}
