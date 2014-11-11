package br.com.xti.logica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Entrada {

	public static void main (String[] args) {
	
		//Escaneia o nome digitado e salva na String nome.
			/*Scanner s = new Scanner(System.in);
			System.out.println("Qual o seu nome?");
			String nome = s.nextLine();
			System.out.println("Bem Vindo " +nome); */
		
		
		//Escaneia e imprime o nome usando caixas de diálogo.	
			String nome = JOptionPane.showInputDialog("Qual o seu nome?");
			JOptionPane.showMessageDialog(null, nome);
	}
}