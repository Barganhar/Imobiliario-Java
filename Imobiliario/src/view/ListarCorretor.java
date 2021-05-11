package view;

import controllers.CorretorController;
import models.Corretor;

public class ListarCorretor {
	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n -- LISTAR CORRETOR -- \n");
		for(Corretor corretorCadastrada : CorretorController.listar()) {
			System.out.println(corretorCadastrada);
		}
		
	}
}