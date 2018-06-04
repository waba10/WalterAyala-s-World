/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gigantes;

import Mandos.Mando;
import walterayala.s.world.AbstractFactory;
import Magos.Mago;
import Dragones.Dragon;

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
    public Mago getMagos(String type) {
        return null;
    }
    
    @Override
    public Dragon getDragones(String type){
        return null;
    }
    @Override
    public Mando getMandos(String type){
        return null;
    }
    
}
