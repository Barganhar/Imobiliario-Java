package view;

import controllers.ComercioController;
import models.Comercio;
import models.Aluguel;

public class ListarAluguel {

	private static ComercioController controller = ComercioController.retornarInstancia();

	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n -- LISTAR ALUGUEL -- \n");
		for (Comercio comercioCadastrada : controller.listarAluguel()) {
			if (comercioCadastrada instanceof Aluguel)
				System.out.println(comercioCadastrada);
		}

	}
}
