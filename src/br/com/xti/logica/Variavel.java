package br.com.xti.logica;

/**
 * Apresentar os conceitos de Variável.
 * @author Thiago Saraiva
 */



public class Variavel {
	
	public static void main(String[] args) {
		
		int idade = 19;
		double preco = 12.45;
		char seco = 'M'; //Unicode
		boolean casado = false;
		
		byte b = 127; //cem
		short s = 32767; // 32 mil
		int i = 2_000_000_000; // 2 bilhões
		long l = 9_000_000_000_000_000_000L; //9 quintilhões
		
		double d = 1.7976931348623157E+308; //IEEE 754
		
		byte bb = 0b01010101; //formato binário (8 bits ou 1 byte)
		short ss = 0b0101010101010101; //16 bits ou 2 bytes
		int ii = 0b01010101010101010101010101010101; //32 bits ou 4 bytes
		
		//Variável de Referência
		String y = "XTI";
		y = "xti.com.br";
		y = null;
		
		System.out.println(y);
	}
}