package br.com.filme.service;

import br.com.filme.model.Filme;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Iterator;

public class GerenciadorFilme {

	private List<Filme> lista;
	
	public GerenciadorFilme() {
		lista = new ArrayList<>();
		
	}

	public void Cadastrar(Filme filme) {
		filme.Cadastrar();
		
	}

	public void Imprimir() {
		if (lista.isEmpty()) {
			System.out.println ("Nenhum filme cadastrado!");
			
		}else {
			for (Filme filme : lista){
				filme.Imprimir();
				System.out.println ("--------------");
				
			}
				}
			}
				
	public void Remover(String idRemover) {
		Iterator <Filme> iterator = lista.iterator();
		boolean removido = false;
		
		while(iterator.hasNext()) {
			Filme filmes = iterator.next();
			if (filmes.getId().equalsIgnoreCase(idRemover)) {
				iterator.remove();
				System.out.println ("Filme removido com sucesso! ");
				
			}
		}
		
		if (!removido) {
			System.out.println ("Filme não encontrado!");
			
		}
			}
	}