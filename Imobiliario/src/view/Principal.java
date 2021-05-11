package view;
import java.util.Scanner;

public class Principal {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] arg) {
		int op;
		do {
			System.out.println("\n______________PROJETO DE IMOBILIARIA______________");
			System.out.println("\n1 - Cadastrar Cliente");
			System.out.println("\n2 - Cadastrar Casa");
			System.out.println("\n3 - Cadastrar Corretor");// arrumar numeragem
			System.out.println("\n4 - Listar Clientes");
			System.out.println("\n5 - Listar Casas");
			System.out.println("\n6 - Listar Corretores");
			System.out.println("\n7 - Deletar Cliente");
			System.out.println("\n8 - Deletar Casa");
			System.out.println("\n9 - Compra da casa");
			//System.out.println("\n9 - Listar compras de casa");
			System.out.println("\n0 - Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				CadastrarCliente.renderizar();
				break;
			case 2:
				//System.out.println("\nteste 2");
				CadastrarCasa.renderizar();
				break;
			case 3:
				CadastrarCorretor.renderizar();
				break;
			case 4:
				ListarCliente.renderizar();
				break;
			case 5:
				ListarCasas.renderizar();
				break;
			case 6:
				ListarCorretor.renderizar();
				break;
			case 7:
				DeletarCliente.renderizar();
				break;
			case 8:
				DeletarCasa.renderizar();
				break;
			case 9:
				//ComprarCasa.renderizar();
				break;
			case 0:
				//ListarComprarCasa.renderizar();
				break;
			default:
				System.out.println("\nOpção invalida!");
				break;				
			}
		}while (op != 0);
		sc.close();
	}

}
