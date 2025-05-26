package br.com.casa.principal;

import java.util.Scanner;
import br.com.casa.service.GerenciadorCasa;
import br.com.casa.model.Casa;


public class ClasseCasa {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		
		GerenciadorCasa gerenciador = new GerenciadorCasa();
		
		int opcao;
		String idRemover;
		
		do {
			
			 System.out.println("\nMenu: ");
	            System.out.println("1. Cadastrar nova casa");
	            System.out.println("2. Exibir todas as casas");
	            System.out.println("3. Remover casa");
	            System.out.println("4. Sair");
	            System.out.println("Escolha uma opção: ");
	            opcao = imput.nextInt();
	            imput.nextLine(); 
	            
	            switch(opcao) {
	            
	            case 1: 
	            	Casa casa = new Casa();
	            	casa.Cadastrar();
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
		
	


