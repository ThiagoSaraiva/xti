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
public class CachorroTeste {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro pitbull = new Cachorro();
        pitbull.raça = "Pit Bull";
        pitbull.tamanho = 40;
        pitbull.latir();
        
        Cachorro viraLata = new Cachorro();
        viraLata.raça = "Vira-Lata";
        viraLata.tamanho = 30;
        viraLata.latir();
    }
    
}
