package br.com.jogo.principal;

import br.com.jogo.model.Jogo;
import br.com.jogo.service.GerenciadorJogo;
import java.util.Scanner;

public class ClasseJogo {

	public static void main(String[] args) {
	Scanner imput = new Scanner(System.in);
	
	GerenciadorJogo gerenciador = new GerenciadorJogo();
	
	int opcao;
	String idRemover;
	
do {
		
		System.out.println("\nMenu: ");
        System.out.println("1. Cadastrar novo jogo");
        System.out.println("2. Exibir todos os jogos");
        System.out.println("3. Remover jogo");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        opcao = imput.nextInt();
        imput.nextLine(); 
        
        switch (opcao) {
        
        case 1: 
        Jogo jogo = new Jogo();
  
        
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
   
}while ( opcao != 6);
   
   imput.close();  		

}

	}
		
