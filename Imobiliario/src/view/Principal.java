
package view;

import java.util.Scanner;

// import controllers.TriagemController;

public class Principal {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;

		do {
			System.out.println("\n-- PROJETO IMOBILIARIA --");
			System.out.println("\n1 - Cliente");
			System.out.println("2 - Casa");
			System.out.println("3 - Corretor");
			System.out.println("4 - Negocios");
			System.out.println("5 - Sair");
			System.out.println("\nDigite a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
				case 1: {
					do {
						System.out.println("\n-- MENU CLIENTE --");
						System.out.println("\n1 - Cadastrar cliente");
						System.out.println("2 - Listar cliente");
						System.out.println("3 - Alterar cliente");
						System.out.println("4 - Deletar cliente");
						System.out.println("0 - Voltar");
						System.out.println("\nDigite a opção desejada: ");
						opcao = sc.nextInt();

						switch (opcao) {
							case 1:
								CadastrarCliente.renderizar();
								break;
							case 2:
								ListarCliente.renderizar();
								break;
							case 3:
								AlterarCliente.renderizar();
								break;
							case 4:
								DeletarCliente.renderizar();
								break;
							case 0:
								System.out.println("Voltando...");
								break;
							default:
								System.out.println("Opção inválida!");
								break;
						}
					} while (opcao != 0);
				}
					break;

				case 2: {
					do {
						System.out.println("\n-- MENU CASA --");
						System.out.println("\n1 - Cadastrar casa");
						System.out.println("2 - Listar casa");
						System.out.println("3 - Alterar casa");
						System.out.println("4 - Deletar casa");
						System.out.println("0 - Voltar");
						System.out.println("\nDigite a opção desejada: ");
						opcao = sc.nextInt();

						switch (opcao) {
							case 1:
								CadastrarCasa.renderizar();
								break;
							case 2:
								ListarCasas.renderizar();
								break;
							case 3:
								AlterarCasa.renderizar();
								break;
							case 4:
								DeletarCasa.renderizar();
								break;
							case 0:
								System.out.println("Voltando...");
								break;
							default:
								System.out.println("Opção inválida!");
								break;
						}
					} while (opcao != 0);
				}
					break;

				case 3:
					do {
						System.out.println("\n-- MENU CORRETOR --");
						System.out.println("\n1 - Cadastrar corretor");
						System.out.println("2 - Listar corretor");
						System.out.println("3 - Alterar corretor");
						System.out.println("4 - Deletar corretor");
						System.out.println("0 - Voltar");
						System.out.println("\nDigite a opção desejada: ");
						opcao = sc.nextInt();

						switch (opcao) {
							case 1:
								CadastrarCorretor.renderizar();
								break;
							case 2:
								ListarCorretor.renderizar();
								break;
							case 3:
								AlterarCorretor.renderizar();
								break;
							case 4:
								DeletarCorretor.renderizar();
								break;
							case 0:
								System.out.println("Voltando...");
								break;
							default:
								System.out.println("Opção inválida!");
								break;
						}
					} while (opcao != 0);
					break;
				case 4:
					do {
						System.out.println("\n-- MENU NEGOCIOS --");
						System.out.println("\n1 - Cadastrar venda");
						System.out.println("2 - Cadastrar aluguel");
						System.out.println("3 - Listar venda");
						System.out.println("4 - Listar aluguel");
						System.out.println("0 - Voltar");
						System.out.println("\nDigite a opção desejada: ");
						opcao = sc.nextInt();

						switch (opcao) {
							case 1:
								CadastrarVenda.renderizar();
								break;
							case 2:
								CadastrarAluguel.renderizar();
								break;
							case 3:
								ListarVenda.renderizar();
								break;
							case 4:
								ListarAluguel.renderizar();
								break;
							case 0:
								System.out.println("Voltando...");
								break;
							default:
								System.out.println("Opção inválida!");
								break;
						}
					} while (opcao != 0);
					break;
				case 5:
					System.out.println("Saindo...");
					break;

				default:
					System.out.println("Opção inválida!");
					break;
			}
		} while (opcao != 5);

	}

}