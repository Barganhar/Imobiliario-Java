package view;
import java.util.Scanner;
import models.Casa;
import controllers.CasaController;

public class CadastrarCasa {

	private static Scanner sc = new Scanner(System.in);
	private static Casa casa;
		
	public static void renderizar() {//public static  Casa renderizar
		casa = new Casa();
		
		System.out.println("\n______________CADASTRAR CASA______________");
		
		System.out.println("\nNome atribuido � casa: ");
		casa.setNome(sc.next());
		
		System.out.println("\nEndere�o: ");
		casa.setEndereco(sc.next());
		
		System.out.println("\nCEP: ");
		casa.setCep(sc.next());
		
		System.out.println("\nValor: ");
		casa.setValor(sc.nextDouble());//estava como float
		
		System.out.println("\nCorretor: ");
		casa.setCorretor(sc.next());
		
		//return casa;
		
		if(CasaController.cadastrar(casa)) {
			System.out.println("\n Casa cadastrada com sucesso!");
		}else {
			System.out.println("\n Essa casa j� existe");
		}
	}

}
