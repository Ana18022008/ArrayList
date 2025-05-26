package br.com.jogo.model;
import java.util.Scanner;

public class Jogo {
	Scanner imput = new Scanner(System.in);

	private String id;
	private String titulo;
	private String plataforma;
	private String classificacao;
	private double preco;
	
	
	public Jogo() {
		
		this.id = "";
		this.titulo = "";
		this.plataforma = "";
		this.classificacao = "";
		this.preco = 0.0;
	}
	
	public Jogo (String id, String titulo, String plataforma, String classificacao, double preco) {
		this.id = id;
		this.titulo = titulo;;
		this.plataforma = plataforma;
		this.classificacao = classificacao;
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

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void Cadastrar() {
		
		System.out.println ("Insira o id do jogo: ");
		id = imput.nextLine();
		System.out.println ("Insira o título: ");
		titulo = imput.nextLine();
		System.out.println ("Insira a plataforma: ");
		plataforma = imput.nextLine();
		System.out.println ("Insira a classificação etária: ");
		classificacao = imput.nextLine();
		System.out.println ("Insira o preço: ");
		preco = imput.nextDouble();
		
	}

	public void Imprimir() {
		System.out.println ("Id: " + id);
		System.out.println ("Título: " + titulo );
		System.out.println ("Plataforma: " + plataforma);
		System.out.println ("Classificação etária: " + classificacao);
		System.out.println ("Preço: " + preco);
		
	}}