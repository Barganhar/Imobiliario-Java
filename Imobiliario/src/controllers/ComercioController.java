package controllers;

import java.util.ArrayList;

import models.Aluguel;
import models.Comercio;
import models.Venda;
import view.IComercio;

public class ComercioController implements IComercio {

    // Singleton
    private static ComercioController controllerComercio;

    public static ComercioController retornarInstancia() {
        if (controllerComercio == null) {
            controllerComercio = new ComercioController();
        }
        return controllerComercio;
    }

    private static ArrayList<Comercio> comercios = new ArrayList<Comercio>();
    private static ArrayList<Venda> vendas = new ArrayList<Venda>();
    private static ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();

    public boolean cadastrar(Comercio comercio) {
        for (Comercio comercioCadastrada : comercios) {
            if (comercioCadastrada.getCasa().equals(comercio.getCasa())) {
                return false;
            }
        }
        comercios.add(comercio);
        if (comercio instanceof Venda) {
            vendas.add((Venda) comercio);
            return true;
        }
        if (comercio instanceof Aluguel) {
            alugueis.add((Aluguel) comercio);
            return true;
        }
        return false;
    }

    @Override
    public Comercio buscarPorCasa(String nome) {
        for (Comercio comercioCadastrada : comercios) {
            if (comercioCadastrada.getNome().equals(nome)) {
                return comercioCadastrada;
            }
        }
        return null;
    }

    public ArrayList<Comercio> listar() {
        return comercios;
    }

    public ArrayList<Venda> listarVenda() {
        return vendas;
    }

    public ArrayList<Aluguel> listarAluguel() {
        return alugueis;
    }

    @Override
    public Boolean deletar(String casa) {
        Comercio comercio = buscarPorCasa(casa);
        if (comercio != null) {
            comercios.remove(comercio);
            alugueis.remove(comercio);
            return true;
        }
        return false;
    }

}
