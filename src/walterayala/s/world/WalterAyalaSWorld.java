/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;


import Mandos.CentroDeMando;
import RecursosMagos.GeneradorOro;
import java.util.ArrayList;
import java.util.Scanner;
import Magos.Raza;

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
        ArrayList<Raza> genoro=new ArrayList<Raza>();
        ArrayList<Raza> genel=new ArrayList<Raza>();
        ArrayList<Raza> gengem=new ArrayList<Raza>();
        ArrayList<Raza> entre=new ArrayList<Raza>();
        ArrayList<Raza> ve1=new ArrayList<Raza>();
        ArrayList<Raza> ve2=new ArrayList<Raza>();
        ArrayList<Raza> atac=new ArrayList<Raza>();
        ArrayList<Raza> entrenadas=new ArrayList<Raza>();
        ArrayList<Raza> defendiendo=new ArrayList<Raza>();
        Raza[] unicoM=new Raza[1];
        ArrayList<Raza> genoro2=new ArrayList<Raza>();
        ArrayList<Raza> genel2=new ArrayList<Raza>();
        ArrayList<Raza> gengem2=new ArrayList<Raza>();
        ArrayList<Raza> entre2=new ArrayList<Raza>();
        ArrayList<Raza> ve12=new ArrayList<Raza>();
        ArrayList<Raza> ve22=new ArrayList<Raza>();
        ArrayList<Raza> atac2=new ArrayList<Raza>();
        ArrayList<Raza> entrenadas2=new ArrayList<Raza>();
        ArrayList<Raza> defendiendo2=new ArrayList<Raza>();
        Raza[] unicoM2=new Raza[1];
        Scanner leer = new Scanner(System.in);
        int raza;
        int raza1;
        System.out.println("-------Bienvenido a WalterAyala's World-------");
        System.out.println("A continuación le diremos la fortaleza de cada raza");
        System.out.println("La raza de Magos posee la característica de generar más recursos por turno");
        System.out.println("La raza de Gigantes posee la característica de que la vida de sus estructuras es el doble");
        System.out.println("La raza de Dragones posee la característica de que el ataque de sus tropas es el doble");
        System.out.println("Ingrese que raza eligirá: ");
        System.out.println("1.Magos     2.Gigantes     3.Dragones");
        
        raza=leer.nextInt();
        
        while(raza!=1 && raza!=2 && raza!=3) {
            System.out.println("Por favor ingrese una raza valida para el jugador 1");
            raza=leer.nextInt();
        }
        Jugador jugador1=new Jugador( 1 , raza, mando1,genoro,genel,gengem,entre,ve1,ve2,entrenadas,atac,defendiendo,unicoM);
        System.out.println("Ingrese que raza eligirá entre: ");
        System.out.println("Magos     Gigantes     Dragones");
        raza1=leer.nextInt();
         while(raza!=1 && raza!=2 && raza!=3) {
            System.out.println("Por favor ingrese una raza valida para el jugador 2");
            raza1=leer.nextInt();
        }
    
        int contador=1, fase=1;
        Jugador jugador2=new Jugador(2, raza1,mando2,genoro2,genel2,gengem2,entre2,ve12,ve22, entrenadas2,atac2,defendiendo2,unicoM2);
        MenuMagos menu = new MenuMagos(contador, jugador1, jugador2);
        MenuMagos menu2 = new MenuMagos(contador, jugador2, jugador1);
        String magos="magos";
        String gigantes="gigantes";
        String dragones="dragones";
        System.out.println("La raza del jugador "+ jugador1.getNum()+ " es "+ jugador1.getRaza());
        System.out.println("La raza del jugador "+ jugador2.getNum()+ " es "+ jugador2.getRaza());
        while(cont!=-1){
            if(cont%2==0){  
              
                menu.Automatico();
                
                menu.menuJugador();
                cont=jugador1.fase(cont);
            }
            else{ 
               
                menu2.Automatico();
                
                menu2.menuJugador();
                cont=jugador2.fase(cont);
            }
        }
    }
    
}
