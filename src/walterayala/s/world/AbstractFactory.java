/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;


import Gigantes.Gigante;
import Magos.Mago;
import Dragones.Dragon;

/**
 *
 * @author HP PC
 */
public interface AbstractFactory {
    Mago getMagos(String type);
    Gigante getGigantes(String type);
    Dragon getDragones(String type);
    
}
