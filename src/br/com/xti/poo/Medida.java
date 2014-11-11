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
public enum Medida {
    
    MM("Milímetro"), CM("Centímetro"), M("Metro");
    
    public String titulo;
    Medida(String titulo){
        this.titulo = titulo;
    }
}
