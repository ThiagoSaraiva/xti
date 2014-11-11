package br.com.xti.logica;

import java.util.Scanner;
import java.util.Random;

public class JogoDados {

	public static void main (String[] args){
	
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu palpite para o valor do dado?");
		int palpite = s.nextInt();
		
		Random r = new Random();
		int valorDoDado = r.nextInt(6)+1; // r.nextInt(6) abrange os números de 0 até 5, por isso é somado 1 sempre, para abrangir de 1 até 6
		
		if (palpite == valorDoDado){
			System.out.println("Voce Acertou!");
			}
		else {
			System.out.println("Voce Errou! Era " + valorDoDado + "!");
			}
	}
}