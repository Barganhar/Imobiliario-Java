package controllers;

import java.util.ArrayList;

import models.Aluguel;
import view.IAluguel;

public class AluguelController implements IAluguel {

	private static AluguelController controller;

	public static AluguelController retornarInstancia() {
		if (controller == null) {
			controller = new AluguelController();
		}
		return controller;
	}

	private ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();

	@Override
	public Aluguel buscarPorNome(String Nome) {
		for (Aluguel aluguelCadastrado : alugueis) {
			if (aluguelCadastrado.getNomeInquilino().equals(Nome)) {
				return aluguelCadastrado;
			}
		}
		return null;
	}
}