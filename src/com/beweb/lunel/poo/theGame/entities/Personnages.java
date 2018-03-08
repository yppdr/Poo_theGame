/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.poo.theGame.entities;

import com.beweb.lunel.poo.theGame.entities.interfaces.ActionInterface;
import com.beweb.lunel.poo.theGame.entities.interfaces.Initializable;

/**
 *
 * @author yannis
 */
public abstract class Personnages implements Initializable,ActionInterface{
    
    public int force,endurance,pv;
    public String nom;
    
    public Personnages(){
     this.initAtributs();   
    }
    
    public Personnages(String n){
        this();
        this.nom = n;
    }
    
    @Override
    public void attaquer(Personnages cible){
       cible.pv = cible.pv -(this.force - cible.endurance);
       
        if (cible.pv <= 0) {
            System.out.println(cible.nom + " est mort comme une merde :( ");
        }else{
            System.out.println(this.nom + " attaque " + cible.nom + " ,il lui reste " + cible.pv + " PV");
        }
    }    
}
