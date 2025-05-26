package br.com.bicicleta.model;
import java.util.Scanner;

public class Bicicleta {
	Scanner imput = new Scanner(System.in);

	private String id;
	private String marca;
	private String modelo;
	private int tamanho_quadro;
	private double preco;
	
	
	public Bicicleta() {
		
		this.marca = "";
		this.modelo = "";
		this.id = "";
		this.tamanho_quadro = 0;
		this.preco = 0.0;
	}
	
	public Bicicleta (String id, String marca, String modelo, int tamanho_quadro, double preco) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho_quadro = tamanho_quadro;
		this.preco = preco;
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTamanho_quadro() {
		return tamanho_quadro;
	}

	public void setTamanho_quadro(int tamanho_quadro) {
		this.tamanho_quadro = tamanho_quadro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void Cadastrar() {
		
		System.out.println ("Insira o id da bicicleta: ");
		id = imput.nextLine();
		System.out.println ("Insira a marca: ");
		marca = imput.nextLine();
		System.out.println ("Insira o modelo: ");
		modelo = imput.nextLine();
		System.out.println ("Insira o tamanho do quadro: ");
		tamanho_quadro = imput.nextInt();
		System.out.println ("Insira o preço: ");
		preco = imput.nextDouble();
		

	}

	public void Imprimir() {
		System.out.println ("Id: " + id);
		System.out.println ("Marca: " + marca );
		System.out.println ("Modelo: " + modelo);
		System.out.println ("Tamanho do quadro: " + tamanho_quadro);
		System.out.println ("Preço: " + preco);
	}
		
	}


