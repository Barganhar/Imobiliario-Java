package models;

import java.util.Date;

public abstract class Comercio {
   
    public Comercio() {
		setCriadoEm(new Date());
	}

	public Cliente cliente;
	public Casa casa;
	public Corretor corretor;
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

	public Date getCriadoEm() {
		return criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Override
	public String toString() {
		return super.toString()+  "\nCliente: " + cliente + " | Casa: " + casa + " | Corretor: " + corretor;
	}


}
