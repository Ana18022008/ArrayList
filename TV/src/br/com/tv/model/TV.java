package br.com.tv.model;

import java.util.Scanner;

public class TV {
	
	private String marca;
	private double tamanho;
	private String resolucao;
	private double preco;
	
	public TV() {
		this.marca = "";
		this.tamanho = 0.0;
		this.resolucao = "";
		this.preco = 0.0;
		
	}
	
	public TV (String marca, double tamanho, String resolucao, double preco) {
		this.marca = marca;
		this.tamanho = tamanho;
		this.resolucao = resolucao;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void Cadastrar() {
		Scanner imput = new Scanner(System.in);
		
		System.out.println ("--TELEVISÃO--");
		System.out.println ("");
		System.out.print("Insira a marca: ");
		marca = imput.nextLine();
		System.out.print ("Insira o tamanho: ");
		tamanho = imput.nextDouble();
		System.out.print ("Insira a resolução: ");
		resolucao = imput.nextLine();
		System.out.print ("Insira o Preço: ");
		preco = imput.nextDouble();
	
	}

	public void Imprimir() {
		System.out.println ("Marca: " + marca);
		System.out.println ("Tamanho: " + tamanho);
		System.out.println ("Resolução: " + resolucao);
		System.out.println ("Preço: " + preco);
	}
	
}
