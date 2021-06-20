package controllers;

import java.util.ArrayList;
import view.ICorretor;
import models.Corretor;

public class CorretorController implements ICorretor {

	private static CorretorController controller;

	public static CorretorController retornarInstancia() {
		if (controller == null) {
			controller = new CorretorController();
		}
		return controller;
	}

	private static ArrayList<Corretor> corretores = new ArrayList<Corretor>();

	@Override
	public ArrayList<Corretor> listar() {
		return corretores;
	}

	@Override
	public boolean cadastrar(Corretor corretor) {
		for (Corretor corretorCadastrada : corretores) {
			if (corretorCadastrada.getCpf().equals(corretor.getNome())) {
				return false;
			}
		}
		corretores.add(corretor);
		return true;
	}

	@Override
	public Corretor buscarPorCpf(String cpf) {
		for (Corretor corretorCadastrado : corretores) {
			if (corretorCadastrado.getCpf().equals(cpf)) {
				return corretorCadastrado;
			}
		}
		return null;
	}

	@Override
	public Boolean deletar(String cpf) {
		Corretor corretor = buscarPorCpf(cpf);
		if (corretor != null) {
			corretores.remove(corretor);
			return true;
		}
		return false;
	}

	@Override
	public void alterar(String cpf, int op, String newValue) {
		Corretor corretor = buscarPorCpf(cpf);
		if (op == 1)
			corretor.setNome(newValue);
		if (op == 2)
			corretor.setCpf(newValue);
	}

}