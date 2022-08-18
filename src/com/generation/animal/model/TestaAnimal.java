package com.generation.animal.model;

import com.generation.animal.Cachorro;
import com.generation.animal.Cavalo;
import com.generation.animal.Preguica;

public class TestaAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Rex", 7, "Au Au Au");
		cachorro.visualizar();
		
		Cavalo cavalo = new Cavalo("Persival", 12, "Iiiiiiirrrwa");
		cavalo.visualizar();
		
		Preguica preguica = new Preguica("Cauã", 5, "Unnnnnnmm");
		preguica.visualizar();
	}

}
