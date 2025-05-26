package br.com.jogo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import br.com.jogo.model.Jogo;

public class GerenciadorJogo {
	private List<Jogo> lista;

	
	public GerenciadorJogo() {
		lista = new ArrayList<>();
	}
	
	public void Cadastrar(Jogo jogo) {
		jogo.Cadastrar();
		
	}
	
	public void Imprimir() {
		if (lista.isEmpty()) {
			System.out.println ("jogo não encontrado");
			
		}else {
			for (Jogo jogo: lista) {
				jogo.Imprimir();
				System.out.println ("-------------");
			}
		}
	}
	
	public void Remover(String idRemover) {
		Iterator <Jogo>iterator = lista.iterator();
		boolean removido = false;
		
		while(iterator.hasNext()) {
			Jogo jogos = iterator.next();
			if(jogos.getId().equalsIgnoreCase(idRemover)) {
				iterator.remove();
				System.out.println ("jogo removido com sucesso!");
				removido = true;
				break;
			}}
		
			
			if (!removido) {	
				System.out.println ("jogo não encontrado!");
				
		}
	}
}
