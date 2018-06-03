/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import Duendes.Duende;
import Gigantes.Gigante;

/**
 *
 * @author HP PC
 */
public interface AbstractFactory {
    Duende getDuendes(String type);
    Gigante getGigantes(String type);
}
