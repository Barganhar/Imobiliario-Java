package controllers;

import java.util.ArrayList;

import models.Venda;

public class VendaController {

    private static ArrayList<Venda> vendas = new ArrayList<Venda>();

    public static ArrayList<Venda> listar() {
        return vendas;
    }

    public static boolean cadastrar(Venda venda) {
        if (buscarPorNome(venda.getNome()) == null) {
            vendas.add(venda);
            return true;
        }
        return false;
    }

    public static Venda buscarPorNome(String Nome) {
        for (Venda vendaCadastrada : vendas) {
            if (vendaCadastrada.getNome().equals(Nome)) {
                return vendaCadastrada;
            }
        }
        return null;
    }
}