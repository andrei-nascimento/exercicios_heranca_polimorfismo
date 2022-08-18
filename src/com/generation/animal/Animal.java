package com.generation.animal;

public abstract class Animal {

	private String nome;
	private int idade;
	private String som;
	
	public Animal(String nome, int idade, String som) { //Método Construtor
		this.nome = nome;
		this.idade = idade;
		this.som = som;
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
	
	public String getSom() {
		return som;
	}
	
	public void setSom(String som) {
		this.som = som;
	}
	
	public void visualizar() {
		System.out.println("Nomde do animal: " + this.nome);
		System.out.println("Idade do animal: " + this.idade);
		System.out.println("Som do Animal: " + this.som);
	}
	
	
}
