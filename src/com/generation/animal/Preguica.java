package com.generation.animal;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String som) {
		super(nome, idade, som);
	}
	
	public void subirArvore() {
		System.out.println("Subindo na árvore...\n");
	}
	
	public void visualizar() {
		super.visualizar();
		this.subirArvore();
	}
}
