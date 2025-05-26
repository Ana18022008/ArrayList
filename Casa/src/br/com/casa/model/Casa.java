package br.com.casa.model;
import java.util.Scanner;

public class Casa {
	Scanner imput = new Scanner(System.in);
	
	private String id;
	private String endereco;
	private double area;
	private int num_quartos;
	private double preco;
	
	public Casa() {
		this.id = "";
		this.endereco = "";
		this.area = 0;
		this.num_quartos = 0;
		this.preco = 0;
	
}

public Casa(String id, String endereco, double area, int num_quartos, double preco) {
	this.id = id;
	this.endereco = endereco;
	this.area = area;
	this.num_quartos = num_quartos;
	this.preco = preco;
}


public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public double getArea() {
	return area;
}

public void setArea(double area) {
	this.area = area;
}

public int getNum_quartos() {
	return num_quartos;
}

public void setNum_quartos(int num_quartos) {
	this.num_quartos = num_quartos;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

public void Cadastrar() {
	System.out.println ("--CASA--");
	System.out.println ("");
	System.out.println ("Insira o Id: ");
	id = imput.nextLine();
	System.out.println ("Insira o endereço: ");
	endereco = imput.nextLine();
	System.out.println ("Insira a área: ");
	area = imput.nextDouble();
	System.out.println ("Insira o número de quartos: ");
	num_quartos = imput.nextInt();
	System.out.println ("Insira o preço: ");
	preco = imput.nextDouble();
}

public void Imprimir() {
	System.out.println ("Id: " + id);
	System.out.println("Endereço: " + endereco);
	System.out.println("Área: " + area);
	System.out.println ("Número de quartos: " + num_quartos);
	System.out.println ("Preço: " + preco);
	
}
	}
