package view;
import java.util.Scanner;
import models.Corretor;

public class CadastrarCorretor {
	
	private static Corretor corretor;
	private static Scanner sc = new Scanner(System.in);
	
	public static Corretor renderizar() {
		corretor = new Corretor();
		
		System.out.println("\n______________CADASTRAR CORRETOR______________");
		
		System.out.println("\n Nome: ");
		corretor.setNome(sc.next());
		
		System.out.println("\n CPF: ");
		corretor.setCpf(sc.next());
		
		return corretor;
	}

}
