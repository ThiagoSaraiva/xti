package br.com.xti.logica;

public class Matriz {
	
	public static void main (String[] args){
	
		String[] uma = {"Ricardo", "Sandra"};
		String[][] duas = {{"Ricardo", "M", "DF"}, {"Sandra", "F", "MG"}};
		
		System.out.println(duas[0][0]); // imprime o elemento "Ricardo"
		System.out.println(duas[1][0]); // imprime o elemento "Sandra"
		System.out.println(duas.length); // 2 elementos no array externo
		System.out.println(duas[0].length); // 3 elementos no primeiro array interno
		
		duas[1][0] = "SANDRA";
		System.out.println(duas[1][0]);
	}
}