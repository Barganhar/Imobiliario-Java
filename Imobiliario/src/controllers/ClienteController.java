package controllers;

import java.util.ArrayList;

import models.Cliente;
import models.Pessoa;

public class ClienteController {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 

	public static ArrayList<Cliente> listar() {
		return clientes;
	}

	public static boolean cadastrar(Cliente cliente) {
		if(buscarPorCpf(cliente.getPessoa().getCpf()) == null) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}	

	public static Cliente buscarPorCpf(String cpf) {
		for(Cliente clienteCadastrado : clientes) {
			if(clienteCadastrado.getPessoa().getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}	
		return null;
	}
	
	public static Boolean deletar(String cpf) {
		Cliente cliente = buscarPorCpf(cpf);
		if(cliente != null) {
			clientes.remove(cliente);
			return true;
		}
		return false;
	}

	public static void alterar(String cpf, int op, String newValue) {
		Cliente cliente = buscarPorCpf(cpf);
		Pessoa pessoa = cliente.getPessoa();
		if(op==1)
			pessoa.setNome(newValue);
		if(op==2)
			pessoa.setCpf(newValue);
		if(op==3)
			pessoa.setEmail(newValue);
		if(op==5)
			pessoa.setGarantia(newValue);

		cliente.setPessoa(pessoa);
	}

	public static void alterar(String cpf, int op, Float newValue) {
		Cliente cliente = buscarPorCpf(cpf);
		Pessoa pessoa = cliente.getPessoa();
		if(op==4)
			pessoa.setSalario(newValue);
		
		cliente.setPessoa(pessoa);
		
	}
}