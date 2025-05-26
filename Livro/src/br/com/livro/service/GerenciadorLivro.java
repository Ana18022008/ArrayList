package br.com.livro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import br.com.livro.model.Livro;

public class GerenciadorLivro {

	
	private List <Livro> lista;

	public GerenciadorLivro() {
		lista = new ArrayList<>();
		
	}

	public void Cadastrar(Livro livro) {
		livro.Cadastrar();
		
	}

	public void Imprimir() {
		if (lista.isEmpty()) {
			System.out.println ("Nenhum livro cadastrado!");
			
		}else {
			for (Livro livro : lista){
				livro.Imprimir();
				System.out.println ("--------------");
				
			}
				}
			}
				
	public void Remover(String idRemover) {
		Iterator <Livro> iterator = lista.iterator();
		boolean removido = false;
		
		while(iterator.hasNext()) {
			Livro livros = iterator.next();
			if (livros.getId().equalsIgnoreCase(idRemover)) {
				iterator.remove();
				System.out.println ("Livro removido com sucesso! ");
				
			}
		}
		
		if (!removido) {
			System.out.println ("Livro não encontrado!");
			
		}
		

			}
	}
