package view;

import controllers.CasaController;
import models.Casa;

public class ListarCasas {

	private static CasaController controller = CasaController.retornarInstancia();

	public static void renderizar() {
		System.out.println("\n".repeat(10));
		System.out.println("\n -- LISTAR CASAS -- \n");
		for (Casa casaCadastrada : controller.listar()) {
			if (casaCadastrada instanceof Casa)
				System.out.println(casaCadastrada);
		}

	}
}
