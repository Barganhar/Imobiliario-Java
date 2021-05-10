package controllers;

import java.util.ArrayList;

import models.Casa;

public class CasaController {
	
	private static ArrayList<Casa> casas = new ArrayList<Casa>();
	
	public static ArrayList<Casa> listar(){
		return casas;
	}

	public static boolean cadastrar(Casa casa) {
		if(buscarPorNome(casa.getNome()) == null) {
			casas.add(casa);
			return true;
		}
		return false;
	}
	
	public static Casa buscarPorNome(String Nome) {
		for(Casa casaCadastrada: casas) {
			if(casaCadastrada.getNome().equals(Nome)) {
				return casaCadastrada;
			}
		}
		return null;
	}
}
