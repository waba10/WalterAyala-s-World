/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gigantes;

import Duendes.Duende;
import walterayala.s.world.AbstractFactory;

/**
 *
 * @author HP PC
 */
public class ReinoGigantes implements AbstractFactory{
    
    @Override
    public Gigante getGigantes(String type) {
        switch (type) {
            case "EscuadronG":
                return new EscuadronG();
            case "Ciclope":
                return new Ciclope();
        }
        return null;
    }

    @Override
    public Duende getDuendes(String type) {
        return null;
    }
    
    
}
