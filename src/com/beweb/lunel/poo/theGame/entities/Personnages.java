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
public class Personnages {
    
    public int force,endurance,pv;
    public String nom;
    
    public Personnages(){
        
    }
    
    public Personnages(String n){
        this();
        this.nom = n;
    }
    
    public void attaquer(Personnages cible){
       cible.pv = cible.pv -(this.force - cible.endurance);
       
        if (cible.pv <= 0) {
            System.out.println(cible.nom + " DEAD COMME UNE MERDE ");
        }else{
            System.out.println(this.nom + " attaque " + cible.nom + " il lui reste " + cible.pv + " PV");
        }
    }    
}
