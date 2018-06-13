/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gigantes;


import walterayala.s.world.AbstractFactory;
import Magos.Mago;
import Dragones.Dragon;
import RecursosGigantes.GeneradorPlata;
import RecursosGigantes.GeneradorPosion;
import RecursosGigantes.GeneradorRubi;
import VehiculoGigantes.Bote;
import VehiculoGigantes.Camion;

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
            case "Bote":
                return new Bote();
            case "Camion":
                return new Camion();
            case "Entrenador":
                return new EntrenadorGigante();
            case "Generador Plata":
                return new GeneradorPlata();
            case "Generador Posion":
                return new GeneradorPosion();
            case "Generador Rubi":
                return new GeneradorRubi();
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
    
    
    
}
