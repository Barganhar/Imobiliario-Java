package view;

import utils.Console;

import controllers.ClienteController;
import controllers.ComercioController;
import controllers.CorretorController;
import controllers.CasaController;
import models.Cliente;
import models.Casa;
import models.Corretor;
import models.Venda;

public class CadastrarVenda {

	private static ComercioController controllerComercio = ComercioController.retornarInstancia();
	private static ClienteController controllerCliente = ClienteController.retornarInstancia();
	private static CorretorController controllerCorretor = CorretorController.retornarInstancia();
	private static CasaController controllerCasa = CasaController.retornarInstancia();
	private static Venda venda;
	private static Cliente cliente;
	private static Casa casa;
	private static Corretor corretor;

	public static void renderizar() {
		System.out.println("\n---------- Efetuar Venda ----------");
		cliente = new Cliente();
		casa = new Casa();
		venda = new Venda();
		corretor = new Corretor();
		String positivo = "SIM";
		String garantia;

		venda.setNome(Console.lerString("\nNome Comprador: "));

		cliente = controllerCliente.buscarPorCpf(Console.lerString("\nInforme o CPF do cliente: "));
		if (cliente != null) {
			garantia = cliente.getGarantia();
			if (garantia.equals(positivo)) {
				venda.setCliente(cliente);

				corretor = controllerCorretor.buscarPorCpf(Console.lerString("\nInforme o CPF do corretor: "));
				if (corretor != null) {
					venda.setCorretor(corretor);

					casa = controllerCasa.buscarPorNome(Console.lerString("\nInforme o Nome da casa: "));
					if (casa != null) {
						String nome = casa.getNome();
						// String valor = casa.getValor();

						System.out.println("\nVender a casa: \nCasa: " + nome);
						// + " | Valor: " + valor

						venda.setCasa(casa);

						// seta tipo automatico
						venda.setTipo("venda");

						Double valor = casa.getValor();

						venda.setValor(valor);

						if (controllerComercio.cadastrar(venda)) {
							System.out.println("\nVenda cadastrada com sucesso!");
						} else {
							System.out.println("Essa casa não esta disponivel!");
						}

					} else {
						System.out.println("Não há casas disponiveis");
					}

				} else {
					System.out.println("\nCorretor não encontrado");
				}

			} else {
				System.out.println("\nCliente sem Garantia");
			}

		} else {
			System.out.println("\nCliente não encontrado");
		}

	}
}