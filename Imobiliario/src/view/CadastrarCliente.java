package view;

import controllers.ClienteController;
import models.Cliente;

public class CadastrarCliente {

	private static Cliente cliente;	
	
	public static void renderizar() {
		cliente = new Cliente();
		System.out.println("\n-- CADASTRO DE CLIENTE --  \n");
		cliente.setPessoa(CadastrarPessoa.renderizar());
		if(ClienteController.cadastrar(cliente)) {
			System.out.println("\nCliente cadastrado com sucesso!");
	
		}else {
			System.out.println("\nJa existe Cleinte com esse nome");
		}
	}
}