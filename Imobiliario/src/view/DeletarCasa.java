package view;

import java.util.Scanner;
import controllers.CasaController;

public class DeletarCasa {
		private static Scanner sc = new Scanner(System.in);
		
		public static void renderizar() {
			System.out.println("\nInsira o nome da casa que deseja deletar: ");
			if(CasaController.deletar(sc.next())) {
				System.out.println("\n Casa deletada com sucesso!");
			}
			else 
				System.out.println("\nCasa solicitada não existe");
		}
}