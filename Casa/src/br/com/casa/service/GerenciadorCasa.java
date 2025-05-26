package br.com.casa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import br.com.casa.model.Casa;

public class GerenciadorCasa {
	private List<Casa> lista;

	
	public GerenciadorCasa() {
		lista = new ArrayList<>();
	}
	
	public void Cadastrar(Casa casa) {
		casa.Cadastrar();
		
	}
	
	public void Imprimir() {
		if (lista.isEmpty()) {
			System.out.println ("Casa não encontrada");
			
		}else {
			for (Casa casa: lista) {
				casa.Imprimir();
				System.out.println ("-------------");
			}
		}
	}
	
	public void Remover(String idRemover) {
		Iterator <Casa>iterator = lista.iterator();
		boolean removido = false;
		
		while(iterator.hasNext()) {
			Casa casas = iterator.next();
			if(casas.getId().equalsIgnoreCase(idRemover)) {
				iterator.remove();
				System.out.println ("Casa removida com sucesso!");
				removido = true;
				break;
			}}
		
			
			if (!removido) {	
				System.out.println ("Casa não encontrada!");
				
		}
	}
}
