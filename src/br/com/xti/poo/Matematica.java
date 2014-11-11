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
public class Matematica {
    
    /**
     * 
     * @param um
     * @param dois
     * @return o maior entre os dois números
     */
    int maior(int um, int dois){
        if (um > dois){
            return um;
        } else {
            return dois;
        }
    }
    
    double soma(double um, double dois){
        return um + dois;
    }
    
    // método com quantos parâmetros o usuário quiser
    double somaVarios(double ... numeros){ // mesma coisa que escrever double somaVarios(double[] numeros)
        double total = 0;
        
        for(double n : numeros){
            total += n;
        }
        return total;
    }
}
