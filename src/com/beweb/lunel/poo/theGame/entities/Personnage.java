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
public class Personnage {
    
    public int force;
    public int pv;
    public int endurance;
    public String nom;
    
    public String attaqueer;
    public String attaquant;
    public int result;
    
    
    public void attaquer(Personnage target){
       int damage = this.force - target.endurance;
       
       
       //Result if attack succeed
       if(damage > 0){
           target.pv -= damage;
           System.out.println(this.nom + " inflige " + damage + " à " + target.nom);
       }
       //Result if fail
       else{
           System.out.println("Echec !");
       }
    }    
}
