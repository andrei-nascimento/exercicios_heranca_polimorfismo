package com.generation.animal;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);
	}
	
	public void correr() {
		System.out.println("Correndo...\n");
	}
	
	public void visualizar() {
		super.visualizar();
		this.correr();
	}

}
