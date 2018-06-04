/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magos;

import Mandos.Mando;
import walterayala.s.world.AbstractFactory;
import Gigantes.Gigante;
import Dragones.Dragon;
import RecursosMagos.GeneradorElixir;
import RecursosMagos.GeneradorGema;
import RecursosMagos.GeneradorOro;
import RecursosMagos.RecolectorGema;
import RecursosMagos.RecolectorOro;
import VehiculoMagos.Alfombra;
import VehiculoMagos.Caballo;

/**
 *
 * @author HP PC
 */
public class ReinoMagos implements AbstractFactory {
 
    
   @Override
    public Gigante getGigantes(String type) {
       
        return null;
    }

    @Override
    public Mago getMagos(String type) {
          switch (type) {
            case "EscuadronM":
                return new EscuadronM();
            case "Merlin":
                return new Merlin();
            case "Alfombra":
                return new Alfombra();
            case "Caballo":
                return new Caballo();
            case "Entrenador":
                return new EntrenadorMago();
            case "Generador de Elixir":
                return new GeneradorElixir();
            case "Generador de Gema":
                return new GeneradorGema();
            case "Generador de Oro":
                return new GeneradorOro();
            case "Recolector de Gema":
                return new RecolectorGema();
            case "Recolector de Oro":
                return new RecolectorOro();
                
        }
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
