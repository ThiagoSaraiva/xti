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
public class ContaTeste {
    
    public static void main (String[] args){
    
        Conta conta = new Conta();
        conta.cliente = "Thiago";
        conta.saldo = 10_000.00;
        
        conta.exibeSaldo();
        
        conta.saca(1000);
        conta.exibeSaldo();
        
        conta.deposita(6000);
        conta.exibeSaldo();
        
        Conta destino = new Conta();
        destino.cliente = "Caio";
        destino.saldo = 0;
        destino.exibeSaldo();
        
        conta.transferePara(destino, 1550);
        conta.exibeSaldo();
        destino.exibeSaldo();
    }
}
