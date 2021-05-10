package view;
import java.util.Scanner;
import models.Casa;

public class CadastrarCasa {
	
	private static Casa casa;
	private static Scanner sc = new Scanner(System.in);
	
	public static Casa renderizar() {
		casa = new Casa();
		
		System.out.println("\n______________CADASTRAR CASA______________");
		
		System.out.println("\nNome atribuido à casa: ");
		casa.setNome(sc.next());
		
		System.out.println("\nEndereço: ");
		casa.setEndereco(sc.next());
		
		System.out.println("\nCEP: ");
		casa.setCep(sc.next());
		
		System.out.println("\nValor: ");
		casa.setValor(sc.nextFloat());
		
		System.out.println("\nCorretor: ");
		casa.setCorretor(sc.next());
		
		return casa;
	}

}
