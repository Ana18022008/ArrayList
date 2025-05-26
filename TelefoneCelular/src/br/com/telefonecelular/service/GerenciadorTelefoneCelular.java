package br.com.telefonecelular.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import br.com.telefonecelular.model.TelefoneCelular;

public class GerenciadorTelefoneCelular {

    private List<TelefoneCelular> lista;

    public GerenciadorTelefoneCelular() {
        lista = new ArrayList<>();
    }

    public void Cadastrar(TelefoneCelular telefone) {
        lista.add(telefone);
    }

    public void Imprimir() {
        if (lista.isEmpty()) {
            System.out.println("Nenhum telefone cadastrado.");
        } else {
            for (TelefoneCelular telefone : lista) {
                telefone.Imprimir();  
            }
        }
    }

    public void Remover(String modeloRemover) {
        Iterator<TelefoneCelular> iterator = lista.iterator();
        boolean removido = false;

        while (iterator.hasNext()) {
            TelefoneCelular tel = iterator.next();
            if (tel.getModelo().equalsIgnoreCase(modeloRemover)) {
                iterator.remove();  
                System.out.println("Telefone removido com sucesso");
                removido = true;
                break;
            }
        }

        if (!removido) {
            System.out.println("Telefone não encontrado.");
        }
    }
}
