package view;

import java.util.Scanner;
import controllers.CorretorController;

public class AlterarCorretor {
	private static Scanner sc = new Scanner(System.in);
	private static CorretorController controller = CorretorController.retornarInstancia();

	public static void renderizar() {
		int op;
		System.out.println("\n-- ALTERAR CORRETOR --  \n");
		System.out.println("Insira o CPF do corretor: ");
		String cpf = sc.next();
		if (controller.buscarPorCpf(cpf) != null) {
			do {
				System.out.println("\nSELECIONE A OP��O DESEJADA PARA ALTERAR");
				System.out.println("\n1- Nome" + "			\n2- CPF" + "			\n0- VOLTAR\n");
				op = sc.nextInt();
				switch (op) {
					case 1:
						System.out.println("\nInsira um novo nome:");
						break;

					case 2:
						System.out.println("\nInsira um novo CPF:");
						break;

					case 0:
						break;

					default:
						System.out.println("\nOp��o inexistente!");
						break;
				}
				if (op != 0)
					controller.alterar(cpf, op, sc.next());

			} while (op != 0);

			System.out.println("\nAlterado com sucesso!\n");
		} else
			System.out.println("\nCliente n�o encontrado");
	}
}