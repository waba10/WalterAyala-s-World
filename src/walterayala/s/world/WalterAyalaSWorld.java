/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import Gigantes.Gigante;
import Magos.Mago;
import java.util.Scanner;

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
        /*AbstractFactory factory;
        
        factory = Produccion.getFactory("Magos");
        Mago escuadronm = factory.getMagos("EscuadronM");
        escuadronm.atacar();
        
        
        factory = Produccion.getFactory("Magos");
        Mago mago = factory.getMagos("Alfombra");
        mago.construir();*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 1 si es el jugador 1");
        int clave;
        clave=leer.nextInt();
        Jugador jugador1=new Jugador(clave);
        System.out.println("Ingrese 2 si es el jugador 2");
        clave=leer.nextInt();
        Jugador jugador2=new Jugador(clave);
        Menu menu = new Menu();
        while(cont!=-1){
            if(cont%2==0){
                
                menu.menuJugador();
                cont=jugador1.fase(cont);
            }
            else{
                
                menu.menuJugador();
                cont=jugador2.fase(cont);
            }
        }
       
        
        
    }
    
}
