package view;
import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] arg) {
		int op;
		do {
			System.out.println("\n______________PROJETO DE IMOBILIARIA______________");
			System.out.println("\n1 - Cadastrar Cliente");
			System.out.println("2 - Cadastrar Casa");
			System.out.println("3 - Listar Clientes");
			System.out.println("4 - Listar Casas");
			System.out.println("5 - Deletar Cliente");
			System.out.println("6 - Deletar Casa");
			System.out.println("7 - Compra da casa");
			System.out.println("8 - Listar compras de casa");
			System.out.println("9 - Teste");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("\nteste 1");
				break;
			case 2:
				System.out.println("\nteste 2");
				break;
			case 3:
				System.out.println("\nteste 3");
				break;
			case 4:
				System.out.println("\nteste 4");
				break;
			case 5:
				System.out.println("\nteste 5");
				break;
			case 6:
				System.out.println("\nteste 6");
				break;
			case 7:
				System.out.println("\nteste 7");
				break;
			case 8:
				System.out.println("\nteste 8");
				break;
			case 9:
				System.out.println("\nteste 9");
				break;
			case 0:
				System.out.println("\nSaindo...");
				break;
			default:
				System.out.println("\nOpção inválida!");
				break;				
			}
		}while (op != 0);
	}

}
