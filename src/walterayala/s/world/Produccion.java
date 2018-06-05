/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import Magos.ReinoMagos;
import Gigantes.ReinoGigantes;

import Dragones.ReinoDragones;

/**
 *
 * @author HP PC
 */
public class Produccion {
    
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Magos":
                return new ReinoMagos();
            case "Gigantes":
                return new ReinoGigantes();
            case "Dragones":
                return new ReinoDragones();
            
        }
        return null;
    }
}
