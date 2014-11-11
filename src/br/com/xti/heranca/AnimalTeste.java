/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.xti.heranca;

/**
 *
 * @author Thiago
 */
public class AnimalTeste {
    
    public static void main (String[] args){
        
        Animal toto = new Cachorro();
        toto.comida = "Carne";
        toto.dormir();
        
        Animal carijo = new Galinha();
        carijo.dormir();
        
        System.out.println();
        
        System.out.println(toto instanceof Cachorro);
        System.out.println(toto instanceof Animal);
        System.out.println(toto instanceof Galinha);
        
        System.out.println();
        
        System.out.println(toto.equals(carijo));
        System.out.println(toto.hashCode());
        System.out.println(toto.getClass());
        System.out.println(toto.toString());
    }
}
