package view;

import controllers.ClienteController;
import models.Cliente;

public class ListarCliente {

	private static ClienteController controller = ClienteController.retornarInstancia();

	public static void renderizar() {
		System.out.println("\n".repeat(20));
		System.out.println("\n -- LISTAR CLIENTE -- \n");
		for (Cliente clienteCadastrada : controller.listar()) {
			if (clienteCadastrada instanceof Cliente)
				System.out.println(clienteCadastrada);
		}

	}
}