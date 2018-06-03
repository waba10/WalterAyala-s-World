/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import Duendes.ReinoDuendes;
import Gigantes.ReinoGigantes;

/**
 *
 * @author HP PC
 */
public class Produccion {
    
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "Duendes":
                return new ReinoDuendes();
            case "Gigantes":
                return new ReinoGigantes();
        }
        return null;
    }
}
