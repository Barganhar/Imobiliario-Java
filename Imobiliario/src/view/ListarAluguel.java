package view;

import controllers.AluguelController;
import models.Aluguel;

public class ListarAluguel {
	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n -- LISTAR ALUGUEL -- \n");
		for (Aluguel aluguelCadastrad0 : AluguelController.listar()) {
			System.out.println(aluguelCadastrad0);
		}

	}
}
