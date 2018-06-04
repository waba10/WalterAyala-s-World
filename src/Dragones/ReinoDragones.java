/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dragones;


import Mandos.Mando;
import walterayala.s.world.AbstractFactory;
import Gigantes.Gigante;
import Magos.Mago;

/**
 *
 * @author HP PC
 */
public class ReinoDragones implements AbstractFactory{
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
        switch (type) {
            case "Dragon":
                return new DragonInfernal();
            case "EscuadronD":
                return new EscuadronD();
        }
        return null;
    }
    @Override
    public Mando getMandos(String type){
        return null;
    }
}
