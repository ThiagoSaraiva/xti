package br.com.xti.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class ColetaLista{
	
	public static void main(String[] args) {
	
		ArrayList<String> produtos = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Digite seus produtos ('FIM' para sair):");
		String produto;
		
		while(!"FIM".equals(produto = s.nextLine())){ // enquanto a string digitada não for igual a FIM, ela é adicionada ao arraylist
			produtos.add(produto);
		}
		System.out.println(produtos.toString());
	}
}