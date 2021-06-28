package view;

import java.util.Scanner;

import controllers.ClienteController;
import controllers.ComercioController;
import controllers.CorretorController;
import controllers.CasaController;
import models.Cliente;
import models.Casa;
import models.Corretor;
import models.Venda;

public class CadastrarVenda {

	private static Scanner sc = new Scanner(System.in);
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

		System.out.println("\nInforme o CPF do cliente: ");
		cliente = controllerCliente.buscarPorCpf(sc.next());
		if (cliente != null) {
			venda.setCliente(cliente);

			System.out.println("\nInforme o CPF do corretor: ");
			corretor = controllerCorretor.buscarPorCpf(sc.next());
			if (corretor != null) {
				venda.setCorretor(corretor);

				System.out.println("\nInforme o Nome da casa: ");
				casa = controllerCasa.buscarPorNome(sc.next());
				if (casa != null) {
					String nome = casa.getNome();
					// String valor = casa.getValor();

					System.out.println("\nAlugar a casa: \nCasa: " + nome);
					// + " | Valor: " + valor

					venda.setCasa(casa);

					controllerComercio.cadastrar(venda);
					System.out.println("\nVenda concluido");

				} else {
					System.out.println("N�o h� casas disponiveis");
				}

			} else {
				System.out.println("\nCliente n�o encontrado");
			}

		} else {
			System.out.println("\nCliente n�o encontrado");
		}

	}
}