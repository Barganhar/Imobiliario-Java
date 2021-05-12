package view;

import java.util.ArrayList;
import java.util.Scanner;

import controllers.CorretorController;
import models.Corretor;

public class CadastrarCorretor {

	private static Scanner sc = new Scanner(System.in);
	private static Corretor corretor;
	private static ArrayList<Corretor> corretores;;

	public static ArrayList<Corretor> renderizar() {
		corretores = new ArrayList<Corretor>();

		corretor = new Corretor();

		System.out.println("\n-----CADASTRO DE CORRETOR-----");
		System.out.println("\nNome: ");
		corretor.setNome(sc.next());

		System.out.println("\nCPF: ");
		corretor.setCpf(sc.next());

		if (CorretorController.cadastrar(corretor)) {
			System.out.println("Corretor cadastrado com sucesso!");
		} else {
			System.out.println("Esse corretor ja existe");
		}

		return corretores;
	}
}
