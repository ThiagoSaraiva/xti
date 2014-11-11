/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.xti.poo;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class PellTeste {
    
    public static void main (String[] args){
        
        Scanner s = new Scanner(System.in);
        Pell raiz = new Pell();
        
        System.out.println("Digite o numero: ");
        int num = s.nextInt();
        int resultado = raiz.calculaRaiz(num);
        System.out.println("A raiz quadrada de " + num + " é " + resultado);
    }
}
