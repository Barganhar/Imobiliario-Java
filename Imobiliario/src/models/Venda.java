package models;

import java.util.Date;

public class Venda extends Comercio {

    public Venda() {
        setCriadoEm(new Date());
    }

    private Date criadoEm;

    public Date getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    private Cliente cliente;
    private Corretor corretor;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "\nCliente: " + cliente + " | Corretor: " + corretor + " | Data Venda: " + getCriadoEm();
    }

}