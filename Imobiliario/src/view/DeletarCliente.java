package view;

import java.util.Scanner;
import controllers.ClienteController;

public class DeletarCliente {
	private static Scanner sc = new Scanner(System.in);
	private static ClienteController controller = ClienteController.retornarInstancia();

	public static void renderizar() {
		System.out.println("\nInsira o CPF do cliente que deseja deletar: ");
		if (controller.deletar(sc.next())) {
			System.out.println("\n Cliente deletado com sucesso!");
		} else
			System.out.println("\nCliente solicitado n�o existe");
	}
}