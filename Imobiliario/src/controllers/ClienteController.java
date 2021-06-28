package controllers;

import java.util.ArrayList;
import view.ICliente;
import models.Cliente;

public class ClienteController implements ICliente {

	private static ClienteController controllerCliente;

	public static ClienteController retornarInstancia() {
		if (controllerCliente == null) {
			controllerCliente = new ClienteController();
		}
		return controllerCliente;
	}

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	@Override
	public ArrayList<Cliente> listar() {
		return clientes;
	}

	@Override
	public boolean cadastrar(Cliente cliente) {
		for (Cliente clienteCadastrada : clientes) {
			if (clienteCadastrada.getNome().equals(cliente.getNome())) {
				return false;
			}
		}
		clientes.add(cliente);
		return true;
	}

	@Override
	public Cliente buscarPorCpf(String cpf) {
		for (Cliente clienteCadastrado : clientes) {
			if (clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
	}

	@Override
	public Boolean deletar(String cpf) {
		Cliente cliente = buscarPorCpf(cpf);
		if (cliente != null) {
			clientes.remove(cliente);
			return true;
		}
		return false;
	}

	@Override
	public void alterar(String cpf, int op, String newValue) {
		Cliente cliente = buscarPorCpf(cpf);
		if (op == 1)
			cliente.setNome(newValue);
		if (op == 2)
			cliente.setCpf(newValue);
		if (op == 3)
			cliente.setEmail(newValue);
		if (op == 5)
			cliente.setGarantia(newValue);
	}

	@Override
	public void alterar(String cpf, int op, Float newValue) {
		Cliente cliente = buscarPorCpf(cpf);
		if (op == 4)
			cliente.setSalario(newValue);

	}
}