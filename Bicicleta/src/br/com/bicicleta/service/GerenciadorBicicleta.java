package br.com.bicicleta.service;

import br.com.bicicleta.model.Bicicleta;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Iterator;

public class GerenciadorBicicleta {

	private List<Bicicleta> lista;
	
	public GerenciadorBicicleta() {
		lista = new ArrayList<>();
		
	}

	public void Cadastrar(Bicicleta bicicleta) {
		bicicleta.Cadastrar();
		
	}

	public void Imprimir() {
		if (lista.isEmpty()) {
			System.out.println ("Nenhum Animal cadastrado!");
			
		}else {
			for (Bicicleta bicicleta : lista){
				bicicleta.Imprimir();
				System.out.println ("--------------");
				
			}
				}
			}
				
	public void Remover(String idRemover) {
		Iterator <Bicicleta> iterator = lista.iterator();
		boolean removido = false;
		
		while(iterator.hasNext()) {
			Bicicleta bicicletas = iterator.next();
			if (bicicletas.getId().equalsIgnoreCase(idRemover)) {
				iterator.remove();
				System.out.println ("Animal removido com sucesso! ");
				
			}
		}
		
		if (!removido) {
			System.out.println ("Animal não encontrado!");
			
		}
			}
	}

	
	
	

	


