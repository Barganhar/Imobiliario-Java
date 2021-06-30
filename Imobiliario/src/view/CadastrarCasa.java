package view;

import utils.Console;
import models.Casa;
import controllers.CasaController;

public class CadastrarCasa {

	private static CasaController controller = CasaController.retornarInstancia();
	private static Casa casa;

	public static void renderizar() {// public static Casa renderizar
		casa = new Casa();

		System.out.println("\n-----CADASTRAR CASA-----");

		casa.setNome(Console.lerString("\nNome atribuido a casa: "));

		casa.setEndereco(Console.lerString("\nEndereço: "));

		casa.setCep(Console.lerString("\nCEP: "));

		casa.setValor(Console.lerDouble("\nValor: "));// estava como float

		// return casa;
		if (controller.cadastrar(casa)) {
			System.out.println("\n Casa cadastrada com sucesso!");
		} else {
			System.out.println("\n Essa casa já existe");
		}
	}

}
