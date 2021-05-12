package view;

import java.util.Scanner;

import models.Pessoa;

public class CadastrarPessoa {

	private static Scanner sc = new Scanner(System.in);
	private static Pessoa pessoa;

	public static Pessoa renderizar() {
		pessoa = new Pessoa();

		System.out.println("\n-----CADASTRO DE PESSOA-----");
		System.out.println("\nNome: ");
		pessoa.setNome(sc.next());

		System.out.println("\nCPF: ");
		pessoa.setCpf(sc.next());

		System.out.println("\nEmail: ");
		pessoa.setEmail(sc.next());

		// OBSERVA��O AQUI POIS � FLOAT
		System.out.println("\nSalário: ");
		pessoa.setSalario(sc.nextFloat());

		// OBSERVA��O AQUI POIS � BOOLEANO
		System.out.println("\nPossui forma de garantia? (S/N)");
		pessoa.setGarantia(sc.next());

		return pessoa;
	}
}
