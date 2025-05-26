package br.com.bolsa.model;
import java.util.Scanner;

public class Bolsa {
	Scanner imput = new Scanner(System.in);

	private String id;
	private String nome_empresa;
	private double preco_acao;
	private double volume_negociacoes;
	private double variacao_diaria;
	
	
	public Bolsa() {
		
		this.id = "";
		this.nome_empresa = "";
		this.preco_acao = 0;
		this.volume_negociacoes = 0;
		this.variacao_diaria = 0.0;
	}

	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getNome_empresa() {
		return nome_empresa;
	}




	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}




	public double getPreco_acao() {
		return preco_acao;
	}




	public void setPreco_acao(double preco_acao) {
		this.preco_acao = preco_acao;
	}




	public double getVolume_negociacoes() {
		return volume_negociacoes;
	}




	public void setVolume_negociacoes(double volume_negociacoes) {
		this.volume_negociacoes = volume_negociacoes;
	}




	public double getVariacao_diaria() {
		return variacao_diaria;
	}




	public void setVariacao_diaria(double variacao_diaria) {
		this.variacao_diaria = variacao_diaria;
	}




	public void Cadastrar() {
		
		System.out.println ("Insira o id da bolsa: ");
		id = imput.nextLine();
		System.out.println ("Insira o nome da empresa: ");
		nome_empresa = imput.nextLine();
		System.out.println ("Insira o preço a ação: ");
		preco_acao = imput.nextDouble();
		System.out.println ("Insira o volume de negociações: ");
		volume_negociacoes = imput.nextDouble();
		System.out.println ("Insira a variação diária: ");
		variacao_diaria = imput.nextDouble();
		
	}

	public void Imprimir() {
		System.out.println ("Id: " + id);
		System.out.println ("Nome da Empresa: " + nome_empresa);
		System.out.println ("Preço da ação: " + preco_acao);
		System.out.println ("Volume de negociações: " + volume_negociacoes);
		System.out.println ("Variacao diaria: " + variacao_diaria);
		
	}}