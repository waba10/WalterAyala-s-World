/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Duendes.Duende;

import Gigantes.Gigante;
import walterayala.s.world.AbstractFactory;

/**
 *
 * @author HP PC
 */
public class FabricaVehiculos implements AbstractFactory{
    @Override
    public Gigante getGigantes(String type) {
        return null;
    }

    @Override
    public Duende getDuendes(String type) {
        return null;
    }
    
    @Override
    public Vehiculo getVehiculos(String type){
        switch (type) {
            case "Caballo":
                return new CaballoDeTroya();
            case "Coche":
                return new CocheBomba();
        }
        return null;
    }
    
}
