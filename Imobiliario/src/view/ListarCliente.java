package view;

import controllers.ClienteController;
import models.Cliente;

public class ListarCliente {
	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n -- LISTAR CLIENTE -- \n");
		for(Cliente clienteCadastrada : ClienteController.listar()) {
			System.out.println(clienteCadastrada);
		}
		
	}
}