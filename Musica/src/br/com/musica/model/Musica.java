package br.com.musica.model;
import java.util.Scanner;

public class Musica {
	Scanner imput = new Scanner(System.in);

	private String id;
	private String titulo;
	private String artista;
	private int duracao;
	private double preco;
	
	
	public Musica() {
		
		this.id = "";
		this.titulo = "";
		this.artista = "";
		this.duracao = 0;
		this.preco = 0.0;
	}
	
	public Musica (String id, String titulo, String artista, int duracao, double preco) {
		this.id = id;
		this.titulo = titulo;;
		this.artista = artista;
		this.duracao = duracao;
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

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void Cadastrar() {
		
		System.out.println ("Insira o id da música: ");
		id = imput.nextLine();
		System.out.println ("Insira o título: ");
		titulo = imput.nextLine();
		System.out.println ("Insira o(s) artista(s): ");
		artista = imput.nextLine();
		System.out.println ("Insira a duração: ");
		duracao = imput.nextInt();
		System.out.println ("Insira o preço: ");
		preco = imput.nextDouble();
		
	}

	public void Imprimir() {
		System.out.println ("Id: " + id);
		System.out.println ("Título: " + titulo );
		System.out.println ("Artista: " + artista);
		System.out.println ("Duração: " + duracao);
		System.out.println ("Preço: " + preco);
	}
	
	public void TocarMusica() {
		System.out.println ("A música " + titulo + " está tocando!");
	}
	
	public void DesligarMusica() {
		System.out.println ("Desligando música " + titulo + "...");
		
	}
		
	}
