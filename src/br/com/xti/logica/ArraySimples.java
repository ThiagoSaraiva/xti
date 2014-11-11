package br.com.xti.logica;

import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {
	
		String[] paises = {"Brasil", "Russia", "India", "China"};
		System.out.println(paises[0]);
		paises[0] = "BRAZIL";
		System.out.println(paises[0]);
		
		System.out.println(paises.length); // imprime o número de elementos de um array
		
		System.out.println(Arrays.toString(paises)); // transforma o array paises em string
		
		int posicao = Arrays.binarySearch(paises, "Russia"); // pesquisa o elemento "Russia" no array paises e retorna a posição
		System.out.println(posicao); // 1
		
		Arrays.sort(paises, 0, paises.length); // ordena o array paises desde a posição 0 até a última
		System.out.println(Arrays.toString(paises)); // [Brasil, China, India, Russia]
		
		
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		
		Double[] valores = {12.35, 3456.3456}; // array de objetos
		System.out.println(valores[0].doubleValue()); // é possível acessar um método do objeto dentro do array
		
		
	}
}