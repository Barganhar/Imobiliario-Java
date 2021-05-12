package view;

import java.util.Scanner;

import controllers.ClienteController;
import models.Cliente;

public class CadastrarCliente {

	private static Scanner sc = new Scanner(System.in);
	private static Cliente cliente;

	public static void renderizar() {
		cliente = new Cliente();

		System.out.println("\n-----CADASTRO DE CLIENTE-----");
		System.out.println("\nNome: ");
		cliente.setNome(sc.next());

		System.out.println("\nCPF: ");
		cliente.setCpf(sc.next());

		System.out.println("\nEmail: ");
		cliente.setEmail(sc.next());

		// OBSERVA��O AQUI POIS � FLOAT
		System.out.println("\nSalário: ");
		cliente.setSalario(sc.nextFloat());

		// OBSERVA��O AQUI POIS � BOOLEANO
		System.out.println("\nPossui forma de garantia? (S/N)");
		cliente.setGarantia(sc.next());

		if (ClienteController.cadastrar(cliente)) {
			System.out.println("Cliente cadastrado com sucesso!");
		} else {
			System.out.println("Esse cliente ja existe");
		}

	}
}
