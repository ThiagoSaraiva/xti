package br.com.xti.logica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class IMC {

	public static void main (String[] args){
		
		/* Scanner s = new Scanner(System.in);
		System.out.println("Digite o seu peso (kg): ");
		double peso = s.nextDouble();
		System.out.println("Digite sua altura (m)");
		double altura = s.nextDouble();
		
		double imc = peso/(altura*altura);
		String w = (imc >= 20 && imc <= 25) ? "Dentro do peso ideal!" : "Fora do peso ideal!";
		
		System.out.println("Seu IMC: " +imc);
		System.out.println(w); */
		
		
		String peso = JOptionPane.showInputDialog("Digite o seu peso (kg):");
		double pesoKg = Double.parseDouble(peso);
		String altura = JOptionPane.showInputDialog("Digite a sua altura (m):");
		double alturaM = Double.parseDouble(altura);
		
		double imc = pesoKg/(alturaM*alturaM);
		String w = (imc >= 20 && imc <= 25) ? "Dentro do peso ideal!" : "Fora do peso ideal!";
		
		String msg = "Seu IMC: " + imc + "\n" + w;
		
		JOptionPane.showMessageDialog(null, msg); 
	
	}
}