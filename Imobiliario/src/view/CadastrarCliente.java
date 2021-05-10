package view;
import java.util.Scanner;
import models.Cliente;

public class CadastrarCliente {

		private static Cliente cliente;
		private static Scanner sc = new Scanner(System.in);
		
		public static Cliente renderizar() {
			cliente = new Cliente();
			
			System.out.println("\n______________CADASTRO DE CLIENTE______________");
			System.out.println("\nNome: ");
			cliente.setNome(sc.next());
			
			System.out.println("\nCPF: ");
			cliente.setCpf(sc.next());
			
			System.out.println("\nEmail: ");
			cliente.setEmail(sc.next());
			
			// OBSERVA��O AQUI POIS � FLOAT
			System.out.println("\nSal�rio: ");
			cliente.setSalario(sc.nextFloat());
			
			// OBSERVA��O AQUI POIS � BOOLEANO
			System.out.println("\nPossui forma de garantia? (S/N)");
			cliente.setGarantia(sc.nextBoolean());
			
			return cliente;
		}
}