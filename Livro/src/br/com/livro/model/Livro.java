package br.com.livro.model;
import java.util.Scanner;

public class Livro {
	Scanner imput = new Scanner(System.in);

	private String id;
	private String titulo;
	private String autor;
	private int num_pag;
	private double preco;
	
	public Livro() {
		
		this.id = "";
		this.titulo = "";
		this.autor = "";
		this.num_pag = 0;
		this.preco = 0.0;
		
	}
	
public Livro ( String id, String titulo, String autor, int num_pag, double preco) {
	this.id = id;
	this.titulo = titulo;
	this.autor = autor;
	this.num_pag = num_pag;
	this.preco = preco;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public int getNum_pag() {
	return num_pag;
}

public void setNum_pag(int num_pag) {
	this.num_pag = num_pag;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public void Cadastrar() {
	System.out.println ("Insira o id do livro: ");
	id = imput.nextLine();
	System.out.println ("Insira o titulo: ");
	titulo = imput.nextLine();
	System.out.println ("Insira o nome do autor: ");
	autor = imput.nextLine();
	imput.nextLine();
	System.out.println ("Insira o número de páginas: ");
	num_pag = imput.nextInt();
	System.out.println ("Insira o preço: ");
	preco = imput.nextDouble();

}

public void Imprimir() {
	System.out.println ("Id: " + id);
	System.out.println ("Título: " + titulo );
	System.out.println ("Autor: " + autor);
	System.out.println ("Número de páginas: " + num_pag);
	System.out.println ("Preço: " + preco);
	
}
	}