package controllers;

import java.util.ArrayList;

import models.Venda;
import view.IVenda;

public class VendaController implements IVenda {

    private static VendaController controller;

	public static VendaController retornarInstancia() {
		if (controller == null) {
			controller = new VendaController();
		}
		return controller;
	}

	private ArrayList<Venda> alugueis = new ArrayList<Venda>();

	@Override
	public Venda buscarPorNome(String Nome) {
		for (Venda vendasCadastrado : alugueis) {
			if (vendasCadastrado.getNomeComprador().equals(Nome)) {
				return vendasCadastrado;
			}
		}
		return null;
	}
}