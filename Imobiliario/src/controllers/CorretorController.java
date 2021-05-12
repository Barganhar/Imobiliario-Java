package controllers;

import java.util.ArrayList;

import models.Corretor;

public class CorretorController {

	private static ArrayList<Corretor> corretores = new ArrayList<Corretor>(); 

	public static ArrayList<Corretor> listar() {
		return corretores;
	}

	public static boolean cadastrar(Corretor corretor) {
		if(buscarPorCpf(corretor.getCpf()) == null) {
			corretores.add(corretor);
			return true;
		}
		return false;
	}	

	public static Corretor buscarPorCpf(String cpf) {
		for(Corretor corretorCadastrado : corretores) {
			if(corretorCadastrado.getCpf().equals(cpf)) {
				return corretorCadastrado;
			}
		}	
		return null;
	}
	
	public static Boolean deletar(String cpf) {
		Corretor corretor = buscarPorCpf(cpf);
		if(corretor != null) {
			corretores.remove(corretor);
			return true;
		}
		return false;
	}
}