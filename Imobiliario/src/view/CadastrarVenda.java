package view;

import java.util.Scanner;

import controllers.ClienteController;
import controllers.CorretorController;
import controllers.VendaController;
import controllers.CasaController;
import models.Cliente;
import models.Casa;
import models.Corretor;
import models.Venda;

public class CadastrarVenda {
	private static Cliente cliente;
	private static Casa casa;
	private static Venda venda;
	private static Scanner sc = new Scanner(System.in);
	private static Corretor corretor;

	public static void renderizar() {
		System.out.println("\n---------- Efetuar Venda ----------");
		cliente = new Cliente();
		casa = new Casa();
		venda = new Venda();
		corretor = new Corretor();

		System.out.println("\nInforme o CPF do cliente: ");
		cliente = ClienteController.buscarPorCpf(sc.next());
		if (cliente != null) {
			venda.setCliente(cliente);

			System.out.println("\nInforme o CPF do corretor: ");
			corretor = CorretorController.buscarPorCpf(sc.next());
			if (cliente != null) {
				venda.setCorretor(corretor);

				System.out.println("\nInforme o Nome da casa: ");
				casa = CasaController.buscarPorNome(sc.next());
				if (casa != null) {
					String nome = casa.getNome();
					// String valor = casa.getValor();

					System.out.println("\nVender a casa: \nCasa: " + nome);
					// + " | Valor: " + valor

					venda.setCasa(casa);

					VendaController.cadastrar(venda);
					System.out.println("\nVenda concluido");

				} else {
					System.out.println("Não há casas disponiveis");
				}

			} else {
				System.out.println("\nCliente não encontrado");
			}

		} else {
			System.out.println("\nCliente não encontrado");
		}

	}

}