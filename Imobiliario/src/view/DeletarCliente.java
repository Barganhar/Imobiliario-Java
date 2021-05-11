package view;

import java.util.Scanner;
import controllers.ClienteController;

public class DeletarCliente {
		private static Scanner sc = new Scanner(System.in);
		
		public static void renderizar() {
			System.out.println("\nInsira o CPF da enfermeira que deseja deletar: ");
			if(ClienteController.deletar(sc.next())) {
				System.out.println("\n Cliente deletada com sucesso!");
			}
			else 
				System.out.println("\nCliente solicitada não existe");
		}
}