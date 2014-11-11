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
public class Carro {
    
    String modelo;
    int velocidadeMaxima;
    double segundosZeroACem;
    Motor motor;
    
    public Carro(){
        
    }
    
    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
    }
    
    public Carro(String modelo, int velocidadeMaxima, double segundosZeroACem, Motor motor){
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.segundosZeroACem = segundosZeroACem;
        this.motor = motor;
    }
}
