package view;

import java.util.Scanner;
import controllers.CasaController;

public class DeletarCasa {
	private static Scanner sc = new Scanner(System.in);
	private static CasaController controller = CasaController.retornarInstancia();

	public static void renderizar() {
		System.out.println("\nInsira o nome da casa que deseja deletar: ");
		if (controller.deletar(sc.next())) {
			System.out.println("\n Casa deletada com sucesso!");
		} else
			System.out.println("\nCasa solicitada n�o existe");
	}
}