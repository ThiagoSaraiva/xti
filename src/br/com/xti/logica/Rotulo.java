package br.com.xti.logica;

public class Rotulo {

	public static void main(String[] args){
	
		for(int i=0; i<10; i++){
			if(i == 5){
				break; // para o loop 
			}
			System.out.println(i);
		}
		
		System.out.println ("\n");
		
		for(int i=0; i<10; i++){
			if(i == 5){
				continue; // para apenas a interação atual
			}
			System.out.println(i);
		}
		
		System.out.println ("\n");
		
		
		boolean[][] matrix = {{false, true, false, false, false}, {false, false, false, false, false}};
		busca: // rótulo
		for(int a=0; a < matrix.length; a++){
			System.out.print("A ");
			for(int b=0; b < matrix[a].length; b++){
				if(matrix[a][b]){
					System.out.print("TRUE ");
					break busca; // para o loop rotulado por "busca" (para ao achar o elemento "TRUE" terminar a busca)
				}
				System.out.print("B ");
			}
		}
	}
}