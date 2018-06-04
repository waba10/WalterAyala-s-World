/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mandos;

import walterayala.s.world.AbstractFactory;
import Gigantes.Gigante;
import Magos.Mago;
import Dragones.Dragon;

/**
 *
 * @author HP PC
 */
public class FabricaMandos implements AbstractFactory {
    @Override
    public Gigante getGigantes(String type) {
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
        switch (type) {
            case "Centro":
                return new CentroDeMando();
            
        }
        return null;
    }
}
