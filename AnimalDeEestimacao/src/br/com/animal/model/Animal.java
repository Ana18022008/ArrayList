package br.com.animal.model;

import java.util.Scanner;
public class Animal {
Scanner imput = new Scanner(System.in);

private String id;
private String especie;
private String raca;
private int idade;
private double peso;
	
public Animal() {
	
	this.id = "";
	this.especie = "";
	this.raca = "";
	this.idade = 0;
	this.peso = 0.0;
	
}

public Animal (String id, String especie, String raca, int idade, double peso) {
	this.id = id;
	this.especie = especie;
	this.raca = raca;
	this.idade = idade;
	this.peso = peso;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso = peso;
}

public void Cadastrar() {
	
	System.out.println ("Insira o id do animal: ");
	id = imput.nextLine();
	System.out.println ("Insira a especie: ");
	especie = imput.nextLine();
	System.out.println ("Insira a raça: ");
	raca = imput.nextLine();
	System.out.println ("Insira a idade: ");
	idade = imput.nextInt();
	System.out.println ("Insira o peso: ");
	peso = imput.nextDouble();
	

}

public void Imprimir() {
	System.out.println ("Id: " + id);
	System.out.println ("Espécie: " + especie );
	System.out.println ("Raça: " + raca);
	System.out.println ("Idade: " + idade);
	System.out.println ("Peso: " + peso);
}
	
}
