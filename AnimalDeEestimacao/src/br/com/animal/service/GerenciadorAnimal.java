package br.com.animal.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.animal.model.Animal;

public class GerenciadorAnimal {

	private List <Animal> lista;
	
	public GerenciadorAnimal() {
		lista = new ArrayList<>();
		
	}

	public void Cadastrar(Animal animal) {
		animal.Cadastrar();
		
	}

	public void Imprimir() {
		if (lista.isEmpty()) {
			System.out.println ("Nenhum Animal cadastrado!");
			
		}else {
			for (Animal animal : lista){
				animal.Imprimir();
				System.out.println ("--------------");
				
			}
				}
			}
				
	public void Remover(String idRemover) {
		Iterator <Animal> iterator = lista.iterator();
		boolean removido = false;
		
		while(iterator.hasNext()) {
			Animal Animais = iterator.next();
			if (Animais.getId().equalsIgnoreCase(idRemover)) {
				iterator.remove();
				System.out.println ("Animal removido com sucesso! ");
				
			}
		}
		
		if (!removido) {
			System.out.println ("Animal não encontrado!");
			
		}
			}
	}
