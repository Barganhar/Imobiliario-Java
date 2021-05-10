package view;

import controllers.CasaController;
import models.Casa;

public class ListarCasas {
	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n -- LISTAR CASAS -- \n");
		for(Casa casaCadastrada : CasaController.listar()) {
			System.out.println(casaCadastrada);
		}
		
	}
}
