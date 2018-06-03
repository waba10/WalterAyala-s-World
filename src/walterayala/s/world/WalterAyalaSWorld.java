/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import Duendes.Duende;

/**
 *
 * @author HP PC
 */
public class WalterAyalaSWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=0;
        AbstractFactory factory;
        
        factory = Produccion.getFactory("Duendes");
        Duende escuadrond = factory.getDuendes("EscuadronD");
        escuadrond.atacar();
        
        
        factory = Produccion.getFactory("Duendes");
        Duende ogro = factory.getDuendes("Ogros");
        ogro.atacar();
       
        
    }
    
}
