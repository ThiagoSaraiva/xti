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
public class Galinha {
    
    public static int ovosDaGranja; // variável global
    
    public int ovos; // total de ovos do objeto galinha
    
    public Galinha botar(){
        this.ovos++;
        Galinha.ovosDaGranja++;
        
        return this;
    }
    
    public static double mediaDeOvos(double galinhas){
        return ovosDaGranja / galinhas; // ou return Galinha.ovosDaGranja
    }
}
