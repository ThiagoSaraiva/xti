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
public class Pell {
    
    int calculaRaiz(int num){
        int[] impares = new int[num];
        int j = 1;
        int k = 0;
        
        for(int i = 0; i < num; i++){
            impares[i] = j;
            j = j + 2;
        }
        
        for(int i = 0; i <= num; i++){
            if(num - impares[i] >= 0){
                num = num - impares[i];
                k++;
            }
        }
        
        return k;
    }
}
