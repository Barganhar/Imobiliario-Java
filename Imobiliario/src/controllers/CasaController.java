package controllers;

import java.util.ArrayList;
import view.ICasa;
import models.Casa;

public class CasaController implements ICasa {

	private static CasaController controllerCasa;

	public static CasaController retornarInstancia() {
		if (controllerCasa == null) {
			controllerCasa = new CasaController();
		}
		return controllerCasa;
	}

	private ArrayList<Casa> casas = new ArrayList<Casa>();

	@Override
	public boolean cadastrar(Casa casa) {
		for (Casa casaCadastrada : casas) {
			if (casaCadastrada.getNome().equals(casa.getNome())) {
				return false;
			}
		}
		casas.add(casa);
		return true;
	}

	@Override
	public ArrayList<Casa> listar() {
		return casas;
	}

	@Override
	public Casa buscarPorNome(String Nome) {
		for (Casa casaCadastrada : casas) {
			if (casaCadastrada.getNome().equals(Nome)) {
				return casaCadastrada;
			}
		}
		return null;
	}

	@Override
	public Boolean deletar(String nome) {
		Casa casa = buscarPorNome(nome);
		if (casa != null) {
			casas.remove(casa);
			return true;
		}
		return false;
	}

	@Override
	public void alterar(String nome, int op, String newValue) {
		Casa casa = buscarPorNome(nome);
		if (op == 1)
			casa.setNome(newValue);
		if (op == 2)
			casa.setEndereco(newValue);
		if (op == 3)
			casa.setCep(newValue);
	}

	@Override
	public void alterar(String nome, int op, Double newValue) {
		Casa casa = buscarPorNome(nome);
		if (op == 4)
			casa.setValor(newValue);

	}
}
