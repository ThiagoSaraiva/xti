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
public class CarroTeste {
    
    public static void main (String[] args){
        
        Carro ferrari = new Carro();
        ferrari.modelo = "Enzo";
        ferrari.velocidadeMaxima = 349;
        ferrari.segundosZeroACem = 3.2;
        Motor v12 = new Motor();
            v12.tipo = "V12";
            v12.potencia = 660;
        ferrari.motor = v12; // adiciona o motor ao carro
        
        Carro k = new Carro("Koenigsegg CCXR", 430, 3.1);
        Motor v8 = new Motor("V8", 1018);
        k.motor = v8;
        
        Carro bugatti = new Carro("Veyron", 430, 2.2, new Motor("W16", 1200));
        
        Carro moto = new Carro();
        moto.modelo = "Titan";
        moto.velocidadeMaxima = 100;
        moto.segundosZeroACem = 60;
        Motor cg = new Motor("CG", 150);
        moto.motor = cg;
        
        
        System.out.println(moto.modelo);
        System.out.println(moto.motor.potencia);
        
    }
   
}
