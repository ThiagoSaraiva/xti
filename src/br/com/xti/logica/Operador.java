package br.com.xti.logica;

import javax.swing.JOptionPane;

public class Operador {

	public static void main (String[] args){
		// 2 + 3 operador binário
		// -2 operador unário
		// true? "sim" : "não" operador ternário
		
		// int x = 9 + 4;
		// ++x (incrementa o valor de x já nessa linha de comando
		// x++ (incrementa o valor de x a partir da próxima linha de comando
		
		String x = "9" + "4"; // concatenação de strings
		System.out.println(x); // 94
		
		Integer y = 6;
		System.out.println(y instanceof Integer); // true
		
		// (x = x + 3) == (x += 3)
		// (x = x - 3) == (x -= 3)
		// (x = x * 3) == (x *= 3)
		// (x = x / 3) == (x /= 3)
		// (x = x % 3) == (x %= 3)
		
		
		int idade = 26;
		String w = (idade >= 18) ? "Maior de Idade" : "Menor de  Idade"; // se idade for >= 18, o texto "Maior de Idade" é retornado. Se não, o texto "Menor de Idade" é retornado
		JOptionPane.showMessageDialog(null, w);
		
		
		String sexo = "M", pais = "Brasil"; // é possível usar a vírgula para criar várias variáveis do mesmo tipo
		
		double pi = Math.PI;
		
		
	}
}