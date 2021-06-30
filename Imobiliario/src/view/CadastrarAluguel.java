package view;

import utils.Console;

import controllers.ClienteController;
import controllers.ComercioController;
import controllers.CorretorController;
import controllers.CasaController;
import models.Cliente;
import models.Casa;
import models.Corretor;
import models.Aluguel;

public class CadastrarAluguel {

	private static ComercioController controllerComercio = ComercioController.retornarInstancia();
	private static ClienteController controllerCliente = ClienteController.retornarInstancia();
	private static CorretorController controllerCorretor = CorretorController.retornarInstancia();
	private static CasaController controllerCasa = CasaController.retornarInstancia();
	private static Aluguel aluguel;
	private static Cliente cliente;
	private static Casa casa;
	private static Corretor corretor;

	public static void renderizar() {
		System.out.println("\n---------- Efetuar Aluguel ----------");
		cliente = new Cliente();
		casa = new Casa();
		aluguel = new Aluguel();
		corretor = new Corretor();

		aluguel.setNome(Console.lerString("\nNome Inquilino: "));

		cliente = controllerCliente.buscarPorCpf(Console.lerString("\nInforme o CPF do cliente: "));
		if (cliente != null) {
			aluguel.setCliente(cliente);

			corretor = controllerCorretor.buscarPorCpf(Console.lerString("\nInforme o CPF do corretor: "));
			if (corretor != null) {
				aluguel.setCorretor(corretor);

				casa = controllerCasa.buscarPorNome(Console.lerString("\nInforme o Nome da casa: "));
				if (casa != null) {
					String nome = casa.getNome();
					// String valor = casa.getValor();

					System.out.println("\nAlugar a casa: \nCasa: " + nome);
					// + " | Valor: " + valor

					aluguel.setCasa(casa);

					// seta tipo automatico
					aluguel.setTipo("aluguel");

					Double valor = casa.getValor();

					aluguel.setValor(valor);

					if (controllerComercio.cadastrar(aluguel)) {
						System.out.println("\nAluguel cadastrado com sucesso!");
					} else {
						System.out.println("Essa casa não está disponivel!");
					}

				} else {
					System.out.println("Não há casas disponiveis");
				}

			} else {
				System.out.println("\nCorretor não encontrado");
			}

		} else {
			System.out.println("\nCliente não encontrado");
		}
	}
}
