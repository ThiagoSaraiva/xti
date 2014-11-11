package br.com.xti.logica;

// Classe que facilita a manipulação de Arrays

import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args){
	
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco"); // Equivalente a fazer: cores[0] = "Branco";
		cores.add("Vermelho"); // Adiciona o elemento na ultima posição do array
		cores.add(0, "Azul"); // Adiciona o elemento na posição 0 e empurra os próximos
		
		System.out.println(cores.toString()); // Imprime os elementos do array cores em forma de uma string
		System.out.println(cores.size()); // Imprime o tamanho do array cores
		System.out.println(cores.get(2)); // Recupera o elemento do indice 2 do array cores
		System.out.println(cores.indexOf("Branco")); // Retorna o indice do elemento "Branco"
		
		cores.remove("Branco"); // Remove o elenento "Branco" do array cores
		cores.contains("Vermelho"); // Retorna true ou false para a existencia do elemento "Vermelho" no array cores
		
	}
}