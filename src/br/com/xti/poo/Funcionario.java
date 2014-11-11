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
public class Funcionario {
    
    private String nome;
    private boolean ativo;
    
    // método criado para captura de informação por outras classes
    public String getNome(){
        return nome;
    }
    
    // método criado para configuração por outras classes
    public void setNome(String n){
        this.nome = n;
    }
    
    // método "get" para variáveis do tipo boolean 
    public boolean isAtivo(){
        return ativo;
    }
    
    // o método "set" continua o mesmo
    public void setAtivo(boolean a){
        this.ativo = a;
    }
}
