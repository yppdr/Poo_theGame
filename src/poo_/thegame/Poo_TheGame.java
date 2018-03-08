/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_.thegame;

import com.beweb.lunel.poo.theGame.entities.Elfe;
import com.beweb.lunel.poo.theGame.entities.Humain;
import com.beweb.lunel.poo.theGame.entities.Personnages;
import com.beweb.lunel.poo.theGame.entities.interfaces.ActionInterface;


/**
 *
 * @author yannis
 */
public class Poo_TheGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnages[] domeDuTonnere = new Personnages[2];
        domeDuTonnere[0] = new Humain("Dieu");
        domeDuTonnere[1] = new Elfe("Jo");

        int fin = 1000;
        
        while(fin > 0){
            double choix = Math.random();
            if (choix > 0.5) {
                domeDuTonnere[0].attaquer(domeDuTonnere[1]);
                fin = domeDuTonnere[1].pv;
            }else{
                domeDuTonnere[1].attaquer(domeDuTonnere[0]);
                fin = domeDuTonnere[0].pv;
            }
            
        }
    }
    
    public static void action(ActionInterface object,Personnages cible){
        object.attaquer(cible);
    }
    
}
