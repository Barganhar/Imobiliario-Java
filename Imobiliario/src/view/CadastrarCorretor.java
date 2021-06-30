package view;

import java.util.ArrayList;
import utils.Console;

import controllers.CorretorController;
import models.Corretor;

public class CadastrarCorretor {

	private static CorretorController controller = CorretorController.retornarInstancia();
	private static Corretor corretor;
	private static ArrayList<Corretor> corretores;;

	public static ArrayList<Corretor> renderizar() {
		corretores = new ArrayList<Corretor>();

		corretor = new Corretor();

		System.out.println("\n-----CADASTRO DE CORRETOR-----");
		corretor.setNome(Console.lerString("\nNome: "));

		corretor.setCpf(Console.lerString("\nCPF: "));

		if (controller.cadastrar(corretor)) {
			System.out.println("Corretor cadastrado com sucesso!");
		} else {
			System.out.println("Esse corretor ja existe");
		}

		return corretores;
	}
}
