package view;

import java.util.Scanner;

import controllers.CorretorController;
import models.Corretor;

public class CadastrarCorretor {

		private static Scanner sc = new Scanner(System.in);
		private static Corretor corretor;

		public static void renderizar() {
			corretor = new Corretor();
			
			System.out.println("\n______________CADASTRO DE CLIENTE______________");
			System.out.println("\nNome: ");
			corretor.setNome(sc.next());
			
			System.out.println("\nCPF: ");
			corretor.setCpf(sc.next());
			
			if (CorretorController.cadastrar(corretor)) {
				System.out.println("Corretor cadastrado com sucesso!");
			} else {
				System.out.println("Esse corretor ja existe");
			}
			
		}
}

