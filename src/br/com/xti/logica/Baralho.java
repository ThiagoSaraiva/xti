package br.com.xti.logica;

import java.util.Random;

public class Baralho{

	public static void main (String[] args){
	
		String[] faces = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] nipes = {"Espadas", "Paus", "Copas", "Ouros"};
		
		Random r = new Random(); // inicializa a variável r do tipo Random
		int indiceFace = r.nextInt(faces.length); // variável que contém um número int aleatório entre 0 e o comprimento da array faces
		String face = faces[indiceFace]; // cria a String que dirá a face escolhida, usando o indice aleatório aplicado no array faces
		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];
		
		String carta = face + " " + nipe;
		System.out.println(carta);
	}
}