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
        
        int cont=0;
        CentroDeMando mando1=new CentroDeMando();
        CentroDeMando mando2=new CentroDeMando();
        ArrayList<Mago> genoro=new ArrayList<Mago>();
        ArrayList<Mago> genel=new ArrayList<Mago>();
        ArrayList<Mago> gengem=new ArrayList<Mago>();
        ArrayList<Mago> entre=new ArrayList<Mago>();
        ArrayList<Mago> ve1=new ArrayList<Mago>();
        ArrayList<Mago> ve2=new ArrayList<Mago>();
        ArrayList<Mago> atac=new ArrayList<Mago>();
        ArrayList<Mago> entrenadas=new ArrayList<Mago>();
        ArrayList<Mago> defendiendo=new ArrayList<Mago>();
        Mago[] unicoM=new Mago[1];
        ArrayList<Mago> genoro2=new ArrayList<Mago>();
        ArrayList<Mago> genel2=new ArrayList<Mago>();
        ArrayList<Mago> gengem2=new ArrayList<Mago>();
        ArrayList<Mago> entre2=new ArrayList<Mago>();
        ArrayList<Mago> ve12=new ArrayList<Mago>();
        ArrayList<Mago> ve22=new ArrayList<Mago>();
        ArrayList<Mago> atac2=new ArrayList<Mago>();
        ArrayList<Mago> entrenadas2=new ArrayList<Mago>();
        ArrayList<Mago> defendiendo2=new ArrayList<Mago>();
        Mago[] unicoM2=new Mago[1];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese que raza eligirá entre: ");
        System.out.println("Magos     Gigantes     Dragones");
        String raza;
        raza=leer.next();
        
        while(!raza.equalsIgnoreCase("Magos")  && !raza.equalsIgnoreCase("Gigantes") && !raza.equalsIgnoreCase("Dragones")) {
            System.out.println("Por favor ingrese una raza valida para el jugador 1");
            raza=leer.next();
        }
        
        Jugador jugador1=new Jugador( 1 , raza, mando1,genoro,genel,gengem,entre,ve1,ve2,entrenadas,atac,defendiendo,unicoM);
        System.out.println("Ingrese que raza eligirá entre: ");
        System.out.println("Magos     Gigantes     Dragones");
        raza=leer.next();
         while(!raza.equalsIgnoreCase("Magos")  && !raza.equalsIgnoreCase("Gigantes") && !raza.equalsIgnoreCase("Dragones")) {
            System.out.println("Por favor ingrese una raza valida para el jugador 2");
            raza=leer.next();
        }
        
        int contador=1;
        Jugador jugador2=new Jugador(2, raza,mando2,genoro2,genel2,gengem2,entre2,ve12,ve22, entrenadas2,atac2,defendiendo2,unicoM2);
        Menu menu = new Menu(contador, jugador1, jugador2);
        Menu menu2 = new Menu(contador, jugador2, jugador1);
        
        System.out.println("La raza del jugador "+ jugador1.getNum()+ " es "+ jugador1.getRaza());
        System.out.println("La raza del jugador "+ jugador2.getNum()+ " es "+ jugador2.getRaza());
        while(cont!=-1){
            if(cont%2==0){  
                menu.menuJugador();
                cont=jugador1.fase(cont);
            }
            else{ 
                menu2.menuJugador();
                cont=jugador2.fase(cont);
            }
        }
    }
    
}
