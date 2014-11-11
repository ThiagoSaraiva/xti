package br.com.xti.logica;

import java.util.GregorianCalendar;
import java.util.Date;


public class Testes{

	public static void main (String[] args){
		
		double a=4.0, b=5.0, c = 3.0;
		long i=3, j, k;
			
		double x = (- b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
		
		System.out.println(x);
	}
}