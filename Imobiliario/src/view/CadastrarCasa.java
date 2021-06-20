package view;

import java.util.Scanner;
import models.Casa;
import controllers.CasaController;

public class CadastrarCasa {

	private static Scanner sc = new Scanner(System.in);
	private static CasaController controller = CasaController.retornarInstancia();
	private static Casa casa;

	public static void renderizar() {// public static Casa renderizar
		casa = new Casa();

		System.out.println("\n-----CADASTRAR CASA-----");

		System.out.println("\nNome atribuido a casa: ");
		casa.setNome(sc.next());

		System.out.println("\nEndere�o: ");
		casa.setEndereco(sc.next());

		System.out.println("\nCEP: ");
		casa.setCep(sc.next());

		System.out.println("\nValor: ");
		casa.setValor(sc.nextDouble());// estava como float

		// return casa;
		if (controller.cadastrar(casa)) {
			System.out.println("\n Casa cadastrada com sucesso!");
		} else {
			System.out.println("\n Essa casa j� existe");
		}
	}

}
