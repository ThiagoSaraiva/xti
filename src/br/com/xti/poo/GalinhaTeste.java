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
public class GalinhaTeste {
    
    public static void main (String[] args){
        
        Galinha g1 = new Galinha();
        g1.botar().botar().botar();
        g1.botar();
        g1.botar();
        g1.botar();
        
        Galinha g2 = new Galinha();
        g2.botar().botar().botar();
        
        System.out.println(g1.ovos);
        System.out.println(g2.ovos);
        System.out.println(Galinha.ovosDaGranja);
        System.out.println(Galinha.mediaDeOvos(2));
    }
    
}
