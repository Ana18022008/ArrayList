package br.com.aluno.principal;

import java.util.Scanner;

import br.com.aluno.model.Aluno;
import br.com.aluno.service.GerenciadorAluno;


public class ClasseAluno {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		GerenciadorAluno gerenciador = new GerenciadorAluno();
		
		int opcao;
		String idRemover;
		
		do {
			
			System.out.println("\nMenu: ");
            System.out.println("1. Cadastrar novo aluno");
            System.out.println("2. Exibir todos os alunos");
            System.out.println("3. Remover aluno");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = imput.nextInt();
            imput.nextLine(); 
            
            switch (opcao) {
            
            case 1: 
            Aluno aluno = new Aluno();
            aluno.Cadastrar();
            
       	 break;
       	 
       case 2:
       	System.out.println ("-------------");
       	gerenciador.Imprimir();
       	System.out.println ("");
       	
       	break;
       	
       case 3:
       	System.out.println ("Insira o Id a remover: ");
       	idRemover = imput.nextLine();
       	gerenciador.Remover(idRemover);
       	System.out.println ("");
       	 break;
       	 
       case 4:
       	System.out.println ("Encerrando programa...");
       	System.out.println ("");
       	break;
       	
       	default: 
       		System.out.println ("Número inválido");
       }
       
}while ( opcao != 4);
       
       imput.close();
       	
       		

	}

}
