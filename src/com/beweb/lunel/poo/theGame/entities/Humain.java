/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.poo.theGame.entities;

/**
 *
 * @author yannis
 */
public class Humain extends Personnages{
    
    
    public Humain(){
     
       
        
    }

    public Humain(String n){
        super(n);
    }

    @Override
    public void initAtributs() {
        this.pv = 100;
        this.force= 100;
        this.endurance = 100;        
    }
    
    

    
    
}
