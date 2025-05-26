package br.com.aluno.model;

import java.util.Scanner;
public class Aluno {
	Scanner imput = new Scanner(System.in);

	private String id;
	private String nome;
	private int idade;
	private String matricula;
	private int anoIngresso;
	
	public Aluno () {
		this.id = "";
		this.nome = "";
		this.idade = 0;
		this.matricula = "";
		this.anoIngresso = 0;

		}

	public Aluno (String id, String nome, int idade, String matricula, int anoIngresso) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.matricula = matricula;
		this.anoIngresso = anoIngresso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
	
	public void Cadastrar() {
		System.out.println ("Insira o id do aluno: ");
		id = imput.nextLine();
		System.out.println ("Insira o nome: ");
		nome = imput.nextLine();
		System.out.println ("Insira a idade: ");
		idade = imput.nextInt();
		imput.nextLine();
		System.out.println ("Insira a matrícula: ");
		matricula = imput.nextLine();
		System.out.println ("Insira o ano que ingressou: ");
		anoIngresso = imput.nextInt();
	
	}
	
	public void Imprimir() {
		System.out.println ("Id: " + id);
		System.out.println ("Nome: " + nome );
		System.out.println ("Idade: " + idade);
		System.out.println ("Matrícula: " + matricula);
		System.out.println ("Ano que ingressou: " + anoIngresso);
	}
}
