package br.com.musica.principal;

import br.com.musica.model.Musica;
import br.com.musica.service.GerenciadorMusica;
import java.util.Scanner;

public class ClasseMusica {

	public static void main(String[] args) {
	Scanner imput = new Scanner(System.in);
	
	GerenciadorMusica gerenciador = new GerenciadorMusica();
	
	int opcao;
	String idRemover;
	
do {
		
		System.out.println("\nMenu: ");
        System.out.println("1. Cadastrar nova música");
        System.out.println("2. Exibir todas as músicas");
        System.out.println("3. Remover música");
        System.out.println("4. Tocar música");
        System.out.println("5. Desligar música");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        opcao = imput.nextInt();
        imput.nextLine(); 
        
        switch (opcao) {
        
        case 1: 
        Musica musica = new Musica();
        musica.Cadastrar();
        
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
	   Musica musica1 = new Musica();
	   musica1.TocarMusica();
	    break;
	    
   case 5:
	   Musica musica2 = new Musica();
	   musica2.DesligarMusica();
	   break;
   	 	 
   case 6:
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
		
