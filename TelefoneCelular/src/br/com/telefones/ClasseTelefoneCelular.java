package br.com.telefones;

import java.util.Scanner;
import br.com.telefonecelular.service.GerenciadorTelefoneCelular;
import br.com.telefonecelular.model.TelefoneCelular;

public class ClasseTelefoneCelular {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        GerenciadorTelefoneCelular gerenciador = new GerenciadorTelefoneCelular();

        int opcao;
        String modeloRemover;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Cadastrar novo telefone");
            System.out.println("2. Exibir todos os telefones");
            System.out.println("3. Remover telefone");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = imput.nextInt();
            imput.nextLine(); 

            switch (opcao) {
                case 1:
                    TelefoneCelular telefone = new TelefoneCelular();
                    telefone.Cadastrar();
                    gerenciador.Cadastrar(telefone);
                
                    break;

                case 2:
                	System.out.println ("-------------------------");
                    gerenciador.Imprimir(); 
                    System.out.println ("-------------------------");
                    System.out.println ("");
                    break;

                case 3:
                    System.out.println("Informe o modelo a ser removido: ");
                    modeloRemover = imput.nextLine();
                    gerenciador.Remover(modeloRemover); 
                    System.out.println ("");
                    break;

                case 4:
                    System.out.println("Encerrando programa...");
                    System.out.println ("");
                    break;

                default:
                    System.out.println("Opção inválida");
                    System.out.println ("");
            }

        } while (opcao != 4);

        imput.close();
    }
}
