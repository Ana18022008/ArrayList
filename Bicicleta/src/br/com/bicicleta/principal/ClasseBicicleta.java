package br.com.bicicleta.principal;

import br.com.bicicleta.model.Bicicleta;
import br.com.bicicleta.service.GerenciadorBicicleta;
import java.util.Scanner;

public class ClasseBicicleta {

	public static void main(String[] args) {
	Scanner imput = new Scanner(System.in);
	
	GerenciadorBicicleta gerenciador = new GerenciadorBicicleta();
	
	int opcao;
	String idRemover;
	
do {
		
		System.out.println("\nMenu: ");
        System.out.println("1. Cadastrar nova bicicleta");
        System.out.println("2. Exibir todas as bicicletas");
        System.out.println("3. Remover bicicleta");
        System.out.println("4. Sair");
        System.out.println("Escolha uma opção: ");
        opcao = imput.nextInt();
        imput.nextLine(); 
        
        switch (opcao) {
        
        case 1: 
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.Cadastrar();
        
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
		
