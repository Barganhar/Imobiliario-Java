package view;

import java.util.Scanner;
import controllers.CasaController;

public class AlterarCasa {
	private static Scanner sc = new Scanner(System.in);
	private static CasaController controller = CasaController.retornarInstancia();

	public static void renderizar() {
		int op;
		System.out.println("\n-- ALTERAR CASA --  \n");
		System.out.println("Insira o nome da casa: ");
		String nome = sc.next();
		if (controller.buscarPorNome(nome) != null) {
			do {
				System.out.println("\nSELECIONE A OPÇÃO DESEJADA PARA ALTERAR");
				System.out.println("\n1- Nome" + "			\n2- Endereço" + "			\n3- CEP"
						+ "			\n4- Valor" + "			\n0- VOLTAR\n");
				op = sc.nextInt();
				switch (op) {
					case 1:
						System.out.println("\nInsira um novo nome:");
						break;

					case 2:
						System.out.println("\nInsira um novo endereço:");
						break;

					case 3:
						System.out.println("\nInsira um novo CEP:");
						break;

					case 4:
						System.out.println("\nInsira um novo Valor:");
						controller.alterar(nome, op, sc.nextDouble());
						break;

					case 0:
						break;

					default:
						System.out.println("\nOpção inexistente!");
						break;
				}
				if (op != 0 && op != 4)
					controller.alterar(nome, op, sc.next());

			} while (op != 0);

			System.out.println("\nAlterado com sucesso!\n");
		} else
			System.out.println("\nCasa não encontrada");
	}
}