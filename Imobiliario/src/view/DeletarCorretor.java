package view;

import java.util.Scanner;
import controllers.CorretorController;

public class DeletarCorretor {
	private static Scanner sc = new Scanner(System.in);

	public static void renderizar() {
		System.out.println("\nInsira o CPF do corretor que deseja deletar: ");
		if (CorretorController.deletar(sc.next())) {
			System.out.println("\n Corretor deletado com sucesso!");
		} else
			System.out.println("\nCorretor solicitado não existe");
	}
}