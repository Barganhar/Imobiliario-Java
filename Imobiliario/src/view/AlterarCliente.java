package view;

import java.util.Scanner;
import controllers.ClienteController;

public class AlterarCliente {
	private static Scanner sc = new Scanner(System.in);
	private static ClienteController controller = ClienteController.retornarInstancia();

	public static void renderizar() {
		int op;
		System.out.println("\n-- ALTERAR CLIENTE --  \n");
		System.out.println("Insira o CPF do cliente: ");
		String cpf = sc.next();
		if (controller.buscarPorCpf(cpf) != null) {
			do {
				System.out.println("\nSELECIONE A OP��O DESEJADA PARA ALTERAR");
				System.out.println("\n1- Nome" + "			\n2- CPF" + "			\n3- Email"
						+ "			\n4- Salario" + "			\n5- Garantia" + "			\n0- VOLTAR\n");
				op = sc.nextInt();
				switch (op) {
					case 1:
						System.out.println("\nInsira um novo nome:");
						break;

					case 2:
						System.out.println("\nInsira um novo CPF:");
						break;

					case 3:
						System.out.println("\nInsira um novo Email:");
						break;

					case 4:
						System.out.println("\nInsira um novo Salario:");
						controller.alterar(cpf, op, sc.nextFloat());
						break;

					case 5:
						System.out.println("\nInsira uma nova Garantia:");
						break;

					case 0:
						break;

					default:
						System.out.println("\nOp��o inexistente!");
						break;
				}
				if (op != 0 && op != 4)
					controller.alterar(cpf, op, sc.next());

			} while (op != 0);

			System.out.println("\nAlterado com sucesso!\n");
		} else
			System.out.println("\nCliente n�o encontrado");
	}
}