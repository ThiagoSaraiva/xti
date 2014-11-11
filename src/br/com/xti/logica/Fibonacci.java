package br.com.xti.logica;

import java.util.ArrayList;

public class Fibonacci {
	
	public static void main(String[] args){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		int i = 0;
		
		while((list.get(i) + list.get(i+1)) <= 50){
			list.add(list.get(i) + list.get(i+1));
			i++;
		}
		System.out.println(list.toString());
	}
}