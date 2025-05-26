package br.com.animal.principal;

import java.util.Scanner;
import br.com.animal.model.Animal;
import br.com.animal.service.GerenciadorAnimal;

public class ClasseAnimal {

	public static void main(String[] args) {
	Scanner imput = new Scanner(System.in);
	
	GerenciadorAnimal gerenciador = new GerenciadorAnimal();
	
		int opcao;
		String idRemover;
		
do {
			
			System.out.println("\nMenu: ");
            System.out.println("1. Cadastrar novo animal");
            System.out.println("2. Exibir todos os animais");
            System.out.println("3. Remover animal");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = imput.nextInt();
            imput.nextLine(); 
            
            switch (opcao) {
            
            case 1: 
            Animal animal= new Animal();
            animal.Cadastrar();
            
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

		
	


