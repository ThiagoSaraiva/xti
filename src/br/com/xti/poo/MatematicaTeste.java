/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.xti.poo;

/**
 *
 * @author Thiago
 */
public class MatematicaTeste {
    
    public static void main (String[] args){
    
        Matematica m = new Matematica();
        int ma = m.maior(10, 20);
        System.out.println(ma);
        
        double so = m.soma(10, 20);
        System.out.println(so);
        
        double somaV = m.somaVarios(1, 2.3, 123, 19932);
        System.out.println(somaV);
    } 
}
