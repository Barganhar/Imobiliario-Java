package view;

import controllers.CorretorController;
import models.Corretor;

public class ListarCorretor {

	private static CorretorController controller = CorretorController.retornarInstancia();

	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n -- LISTAR CORRETOR -- \n");
		for (Corretor corretorCadastrada : controller.listar()) {
			if (corretorCadastrada instanceof Corretor)
				System.out.println(corretorCadastrada);
		}

	}
}