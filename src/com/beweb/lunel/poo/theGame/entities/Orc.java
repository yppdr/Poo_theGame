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
public class Orc extends Personnages{
    
    public Orc(String n){
        super(n);
    }

    @Override
    public void initAtributs() {
        this.pv = 100;
        this.force= 150;
        this.endurance = 50;
    }
    
    
}
