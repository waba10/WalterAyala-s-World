/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magos;


import walterayala.s.world.AbstractFactory;
import Dragones.DragonInfernal;
import Dragones.EntrenadorDragon;
import Dragones.EscuadronD;
import Gigantes.Ciclope;
import Gigantes.EntrenadorGigante;
import Gigantes.EscuadronG;
import RecursosDragones.GeneradorBronce;
import RecursosDragones.GeneradorDiamante;
import RecursosDragones.GeneradorLava;
import RecursosGigantes.GeneradorPlata;
import RecursosGigantes.GeneradorPosion;
import RecursosGigantes.GeneradorRubi;
import RecursosMagos.GeneradorElixir;
import RecursosMagos.GeneradorGema;
import RecursosMagos.GeneradorOro;
import VehiculoDragones.Avion;
import VehiculoDragones.Nave;
import VehiculoGigantes.Bote;
import VehiculoGigantes.Camion;
import VehiculoMagos.Alfombra;
import VehiculoMagos.Caballo;

/**
 *
 * @author HP PC
 */
public class Reino implements AbstractFactory {

    @Override
    public Raza getMagos(String type) {
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
            /*case "Dragon":
                return new DragonInfernal();
            case "EscuadronD":
                return new EscuadronD();
            case "EntrenadorD":
                return new EntrenadorDragon();
            case "Avion":
                return new Avion();
            case "Nave":
                return new Nave();
            case "Generador de Bronce":
                return new GeneradorBronce();
            case "Generador de Diamante":
                return new GeneradorDiamante();
            case "Generador de Lava":
                return new GeneradorLava();
            case "Bote":
                return new Bote();
            case "Camion":
                return new Camion();
            case "Generador de Plata":
                return new GeneradorPlata();
            case "Generador de Posion":
                return new GeneradorPosion();
            case "Generador de Rubi":
                return new GeneradorRubi();
            case "Ciclope":
                return new Ciclope();
            case "EscuadronG":
                return new EscuadronG();
            case "EntrenadorG":
                return new EntrenadorGigante();
           
                */
        }
        return null;
    }
   
     
}
