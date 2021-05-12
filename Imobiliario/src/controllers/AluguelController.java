package controllers;

import java.util.ArrayList;

import models.Aluguel;

public class AluguelController {

	private static ArrayList<Aluguel> alugueis = new ArrayList<Aluguel>();

	public static ArrayList<Aluguel> listar() {
		return alugueis;
	}

	public static boolean cadastrar(Aluguel aluguel) {
		if (buscarPorAluguel(aluguel.getAluguel()) == null) {
			alugueis.add(aluguel);
			return true;
		}
		return false;
	}

	public static Aluguel buscarPorAluguel(String Aluguel) {
		for (Aluguel aluguelCadastrado : alugueis) {
			if (aluguelCadastrado.getAluguel().equals(Aluguel)) {
				return aluguelCadastrado;
			}
		}
		return null;
	}

	public static Boolean deletar(String casa) {
		Aluguel aluguel = buscarPorAluguel(casa);
		if (aluguel != null) {
			alugueis.remove(aluguel);
			return true;
		}
		return false;
	}
}