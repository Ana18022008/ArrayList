package br.com.musica.service;

import br.com.musica.model.Musica;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Iterator;

public class GerenciadorMusica {

	private List<Musica> lista;
	
	public GerenciadorMusica() {
		lista = new ArrayList<>();
		
	}

	public void Cadastrar(Musica musica) {
		musica.Cadastrar();
		
	}
	
	public void TocarMusica(Musica musica) {
		musica.TocarMusica();
	}
	
	public void DesligarMusica(Musica musica) {
		if (lista.isEmpty()) {
			System.out.println ("Nenhuma música está tocando!");
			
		}else {
			for (Musica musica1 : lista){
				musica.DesligarMusica();
				System.out.println ("--------------");
				
	}}}

	public void Imprimir() {
		if (lista.isEmpty()) {
			System.out.println ("Nenhuma música cadastrada!");
			
		}else {
			for (Musica musica : lista){
				musica.Imprimir();
				System.out.println ("--------------");
				
			}
				}
			}
				
	public void Remover(String idRemover) {
		Iterator <Musica> iterator = lista.iterator();
		boolean removido = false;
		
		while(iterator.hasNext()) {
			Musica musicas = iterator.next();
			if (musicas.getId().equalsIgnoreCase(idRemover)) {
				iterator.remove();
				System.out.println ("Música removida com sucesso! ");
				
			}
		}
		
		if (!removido) {
			System.out.println ("Música não encontrada!");
			
		}
			}
	}

	
	
	

	


