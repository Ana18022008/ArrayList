package br.com.aluno.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import br.com.aluno.model.Aluno;

public class GerenciadorAluno {
private List <Aluno> lista;

public GerenciadorAluno() {
	lista = new ArrayList<>();
	
}

public void Cadastrar(Aluno aluno) {
	aluno.Cadastrar();
	
}

public void Imprimir() {
	if (lista.isEmpty()) {
		System.out.println ("Nenhum aluno cadastrado!");
		
	}else {
		for (Aluno aluno : lista){
			aluno.Imprimir();
			System.out.println ("--------------");
			
		}
			}
		}
			
public void Remover(String idRemover) {
	Iterator <Aluno> iterator = lista.iterator();
	boolean removido = false;
	
	while(iterator.hasNext()) {
		Aluno alunos = iterator.next();
		if (alunos.getId().equalsIgnoreCase(idRemover)) {
			iterator.remove();
			System.out.println ("Aluno removido com sucesso! ");
			
		}
	}
	
	if (!removido) {
		System.out.println ("Aluno não encontrado!");
		
	}
	

		}
}

