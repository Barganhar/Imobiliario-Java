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

	public static Boolean deletar(String nome) {
		Casa casa = buscarPorNome(nome);
		if(casa != null) {
			casas.remove(casa);
			return true;
		}
		return false;
	}

	public static void alterar(String nome, int op, String newValue) {
		Casa casa = buscarPorNome(nome);
		if(op==1)
			casa.setNome(newValue);
		if(op==2)
			casa.setEndereco(newValue);
		if(op==3)
			casa.setCep(newValue);
	}

	public static void alterar(String nome, int op, Double newValue) {
		Casa casa = buscarPorNome(nome);
		if(op==4)
			casa.setValor(newValue);
		
	}
}
