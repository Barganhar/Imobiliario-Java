package controllers;

import java.util.ArrayList;

import models.Venda;

public class VendaController {

    private static ArrayList<Venda> vendas = new ArrayList<Venda>();

    public static ArrayList<Venda> listar() {
        return vendas;
    }

    public static boolean cadastrar(Venda aluguel) {
        if (buscarPorVenda(aluguel.getVenda()) == null) {
            vendas.add(aluguel);
            return true;
        }
        return false;
    }

    public static Venda buscarPorVenda(String Venda) {
        for (Venda vendaCadastrado : vendas) {
            if (vendaCadastrado.getVenda().equals(Venda)) {
                return vendaCadastrado;
            }
        }
        return null;
    }

    public static Boolean deletar(String casa) {
        Venda venda = buscarPorVenda(casa);
        if (venda != null) {
            vendas.remove(venda);
            return true;
        }
        return false;
    }
}