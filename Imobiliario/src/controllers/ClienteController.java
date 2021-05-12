package controllers;

import java.util.ArrayList;

import models.Cliente;

public class ClienteController {

	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 

	public static ArrayList<Cliente> listar() {
		return clientes;
	}

	public static boolean cadastrar(Cliente cliente) {
		if(buscarPorCpf(cliente.getCpf()) == null) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}	

	public static Cliente buscarPorCpf(String cpf) {
		for(Cliente clienteCadastrado : clientes) {
			if(clienteCadastrado.getCpf().equals(cpf)) {
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
		if(op==1)
			cliente.setNome(newValue);
		if(op==2)
			cliente.setCpf(newValue);
		if(op==3)
			cliente.setEmail(newValue);
		if(op==5)
			cliente.setGarantia(newValue);
	}

	public static void alterar(String cpf, int op, Float newValue) {
		Cliente cliente = buscarPorCpf(cpf);
		if(op==4)
			cliente.setSalario(newValue);
		
	}
}