package controllers;

import java.util.ArrayList;

import models.Aluguel;

public class AluguelController {

	private static ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();

	public static ArrayList<Aluguel> listar() {
		return alugueis;
	}

	public static boolean cadastrar(Aluguel aluguel) {
		if (buscarPorNome(aluguel.getNome()) == null) {
			alugueis.add(aluguel);
			return true;
		}
		return false;
	}

	public static Aluguel buscarPorNome(String Nome) {
		for (Aluguel aluguelCadastrado : alugueis) {
			if (aluguelCadastrado.getNome().equals(Nome)) {
				return aluguelCadastrado;
			}
		}
		return null;
	}
}