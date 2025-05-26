package br.com.filme.principal;

import br.com.filme.model.Filme;
import br.com.filme.service.GerenciadorFilme;
import java.util.Scanner;

public class ClasseFilme {

	public static void main(String[] args) {
	Scanner imput = new Scanner(System.in);
	
	GerenciadorFilme gerenciador = new GerenciadorFilme();
	
	int opcao;
	String idRemover;
	
do {
		
		System.out.println("\nMenu: ");
        System.out.println("1. Cadastrar novo filme");
        System.out.println("2. Exibir todos os fimes");
        System.out.println("3. Remover filme");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        opcao = imput.nextInt();
        imput.nextLine(); 
        
        switch (opcao) {
        
        case 1: 
        Filme filme = new Filme();
        filme.Cadastrar();
        
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
		
