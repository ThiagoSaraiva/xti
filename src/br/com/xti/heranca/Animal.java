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
public class Animal {
    
    protected int serial;
    double peso;
    String comida;
    
    public Animal(double peso, String comida){
        this.peso = peso;
        this.comida = comida;
    }
    
    void dormir(){
        System.out.println("Dormiu");
    }
    
    void fazerBarulho(){
        System.out.println("Fazer Barulho");
    }
}
