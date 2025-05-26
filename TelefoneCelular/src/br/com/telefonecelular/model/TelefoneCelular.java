package br.com.telefonecelular.model;

import java.util.Scanner;

public class TelefoneCelular {

    private String marca;
    private String modelo;
    private double preco;
    private int memoria;

    public TelefoneCelular() {
        this.marca = "";
        this.modelo = "";
        this.preco = 0.0;
        this.memoria = 0;
    }

    public TelefoneCelular(String marca, String modelo, double preco, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.memoria = memoria;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void Cadastrar() {
        Scanner imput = new Scanner(System.in);

        System.out.println("--CELULAR--");

        System.out.print("Insira a marca: ");
        marca = imput.nextLine();

        System.out.print("Insira o modelo: ");
        modelo = imput.nextLine();

        System.out.print("Insira o preço: ");
        preco = imput.nextDouble();

        System.out.print("Insira o espaço de armazenamento: ");
        memoria = imput.nextInt();
        imput.nextLine(); 

    }

    public void Imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + preco);
        System.out.println("Espaço de armazenamento (memória): " + memoria);
    }
}
