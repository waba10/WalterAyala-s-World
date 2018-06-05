/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import Gigantes.Gigante;
import Magos.Mago;
import Mandos.CentroDeMando;
import RecursosMagos.GeneradorOro;
import java.util.ArrayList;
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
        CentroDeMando mando1=new CentroDeMando();
        CentroDeMando mando2=new CentroDeMando();
        ArrayList<GeneradorOro> geno=new ArrayList<GeneradorOro>();
        /*AbstractFactory factory;
        
        factory = Produccion.getFactory("Magos");
        Mago escuadronm = factory.getMagos("EscuadronM");
        escuadronm.atacar();
        
        
        factory = Produccion.getFactory("Magos");
        Mago mago = factory.getMagos("Alfombra");
        mago.construir();*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese que raza eligirá");
        String raza;
        raza=leer.next();
        
        /*while(raza!="Magos") {
            System.out.println("Ingrese que raza eligirá");
            raza=leer.next();
        }*/
        
        Jugador jugador1=new Jugador(geno, 1 , raza, mando1);
        System.out.println("Ingrese que raza eligirá");
        raza=leer.next();
        /*while(raza!="Gigantes") {
            System.out.println("Ingrese que raza eligirá");
            raza=leer.next();
        }*/
        Jugador jugador2=new Jugador(geno,2, raza,mando2);
        Menu menu = new Menu();
        System.out.println("La raza del jugador "+ jugador1.getNum()+ " es "+ jugador1.getRaza());
        System.out.println("La raza del jugador "+ jugador2.getNum()+ " es "+ jugador2.getRaza());
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
