package view;

import java.util.Scanner;

import controllers.ClienteController;
import controllers.CorretorController;
import controllers.AluguelController;
import controllers.CasaController;
import models.Cliente;
import models.Casa;
import models.Corretor;
import models.Aluguel;

public class CadastrarAluguel {
	private static Cliente cliente;
	private static Casa casa;
	private static Aluguel aluguel;
	private static Scanner sc = new Scanner(System.in);
	private static Corretor corretor;

	public static void renderizar() {
		System.out.println("\n---------- Efetuar Aluguel ----------");
		cliente = new Cliente();
		casa = new Casa();
		aluguel = new Aluguel();
		corretor = new Corretor();

		System.out.println("\nInforme o CPF do cliente: ");
		cliente = ClienteController.buscarPorCpf(sc.next());
		if (cliente != null) {
			aluguel.setCliente(cliente);

			System.out.println("\nInforme o CPF do corretor: ");
			corretor = CorretorController.buscarPorCpf(sc.next());
			if (corretor != null) {
				aluguel.setCorretor(corretor);

				System.out.println("\nInforme o Nome da casa: ");
				casa = CasaController.buscarPorNome(sc.next());
				if (casa != null) {
					String nome = casa.getNome();
					// String valor = casa.getValor();

					System.out.println("\nAlugar a casa: \nCasa: " + nome);
					// + " | Valor: " + valor

					aluguel.setCasa(casa);

					AluguelController.cadastrar(aluguel);
					System.out.println("\nAluguel concluido");

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
