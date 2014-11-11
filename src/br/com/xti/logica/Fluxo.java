package br.com.xti.logica;

import java.util.ArrayList;

public class Fluxo {

	public static void main (String[] args){
		
		boolean passou = true;
		if(passou) {
			System.out.println("Contratado!");
		}
		
		
		int numero = 11;
		if(numero%2 == 0){
			System.out.println("Par!");
			}
		else {
			System.out.println("Impar!");
			}
			
			
		int idade = 113;
		if(idade <= 11){
			System.out.println("Crianca!");
			}
		else if (idade > 11 && idade <= 18){
			System.out.println("Adolescente!");
			}
		else if (idade > 18 && idade <= 60){
			System.out.println("Adulto!");
			}
		else {
			System.out.println("Idoso!");
			}
	
	
	
		//------------------------------------------------------------------------------------------------------------------------------------------------------
			System.out.println("\n\n\n");
		//------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
		char sexo = 'M';
		switch(sexo){ // o switch só compara o valor recebido na sua avaliação com os casos previstos dentro do bloco, avaliação apenas de comparação
			case 'M':
				System.out.println("Macho");
				break;
			case 'F':
				System.out.println("Femea");
				break;
			default: // é possível não usar o caso default
				System.out.println("Outro");
		}
		
		
		String tecnologia = "c+";
		switch(tecnologia){
			// as 3 linhas a seguir são equivalentes a: if(tecnologia == "java" || tecnologia == "c++" || tecnologia == "cobol")
			case "java":
			case "c++":
			case "cobol":
				System.out.println("Linguagem de Programacao");
				break; // desse modo não é necessário usar um brake para cada case
			case "oracle":
			case "sqlserver":
			case "postgresql":
				System.out.println("Banco de Dados");
				break;
			default:
				System.out.println("Tecnologia Desconhecida");
				
			}
			
			
		//------------------------------------------------------------------------------------------------------------------------------------------------------
			System.out.println("\n\n\n");
		//------------------------------------------------------------------------------------------------------------------------------------------------------
			
			
			
			
			
		String texto = "";
		for (int i=0; i<3; i++){ // a variável i só pode ser usada dentro do bloco for
			texto += i + ","; // texto = texto + i;
		}
		System.out.println(texto);
		
		
		for (int i=20; i>0; i--){
			if (i % 2 == 0){
				System.out.print(i+",");
			}
		}
		
		
		System.out.println();
		int tamanho = 20;
		for (int j=0; j<tamanho; j++){
			for(int i=0; i<tamanho; i++){
			System.out.print("* ");
			}
		System.out.println();
		}
		
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------
			System.out.println("\n\n\n");
		//------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		
		
		int[] pares = {2, 4, 6, 8};
		for (int i=0; i<pares.length; i++){
			System.out.println(pares[i]);
			}
		
		System.out.println("\n");
		
		for(int par : pares){ // for aprimorado: "percorra cada elemento par do tipo int existente dentro do array pares"
			System.out.println(par);
			}
		
		System.out.println("\n");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
				list.add(i);
			}
		for(Integer numeroo : list){
				System.out.println(numeroo);
			}
		
		
		
		//------------------------------------------------------------------------------------------------------------------------------------------------------
			System.out.println("\n\n\n");
		//------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		
		
		int i = 0;
		while(i < 2){ // executa apenas se a condição for satisfeita ou enquanto ela for satisfeita
			System.out.println(i);
			i++;
			}
		
		System.out.println("\n");
		
		do{ // executa no mínimo a primeira vez ou enquanto a condição for satisfeita
			System.out.println(i);
			i++;
			} while(i < 2);
	}
}