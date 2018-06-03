/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duendes;

import Gigantes.Gigante;
import walterayala.s.world.AbstractFactory;

/**
 *
 * @author HP PC
 */
public class ReinoDuendes implements AbstractFactory {
 
    
   @Override
    public Gigante getGigantes(String type) {
       
        return null;
    }

    @Override
    public Duende getDuendes(String type) {
          switch (type) {
            case "EscuadronD":
                return new EscuadronD();
            case "Ciclope":
                return new Ogros();
        }
        return null;
    }
    
}
