/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;


import Mandos.CentroDeMando;
import Recursos.GeneradorOro;
import java.util.ArrayList;
import java.util.Scanner;
import Razas.Raza;

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
        ArrayList<Raza> unicoM=new ArrayList<Raza>();
        ArrayList<Raza> genoro2=new ArrayList<Raza>();
        ArrayList<Raza> genel2=new ArrayList<Raza>();
        ArrayList<Raza> gengem2=new ArrayList<Raza>();
        ArrayList<Raza> entre2=new ArrayList<Raza>();
        ArrayList<Raza> ve12=new ArrayList<Raza>();
        ArrayList<Raza> ve22=new ArrayList<Raza>();
        ArrayList<Raza> atac2=new ArrayList<Raza>();
        ArrayList<Raza> entrenadas2=new ArrayList<Raza>();
        ArrayList<Raza> defendiendo2=new ArrayList<Raza>();
        ArrayList<Raza> unicoM2=new ArrayList<Raza>();
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        int raza=0;
        int raza1=0;
        System.out.println("-------Bienvenido a WalterAyala's World-------");
        System.out.println("A continuación le diremos la fortaleza de cada raza");
        System.out.println("La raza de Magos posee la característica de generar más recursos por turno");
        System.out.println("La raza de Gigantes posee la característica de que la vida de sus estructuras es el doble");
        System.out.println("La raza de Dragones posee la característica de que el ataque de sus tropas es el doble");
        System.out.println("Ingrese que raza eligirá: ");
        System.out.println("1.Magos     2.Gigantes     3.Dragones");
        try {
            System.out.println("\nDigite una opcion: ");
            raza = leer.nextInt();
        } catch (Exception e) {
            System.err.println("\nNo ingresó un numero\n");
        }
        
       
        
        while(raza!=1 && raza!=2 && raza!=3) {
            
             try {
                                System.out.println("\nDigite una opcion: ");
                                 raza=leer.nextInt();
                            } catch (Exception e) {
                                System.err.println("\nNo ingresó un numero\n");
                                raza=1;
                            }
            
        }
        Jugador jugador1=new Jugador( 1 , raza, mando1,genoro,genel,gengem,entre,ve1,ve2,entrenadas,atac,defendiendo,unicoM);
        System.out.println("Ingrese que raza eligirá entre: ");
        System.out.println("1.Magos     2.Gigantes     3.Dragones");
         try {
                                System.out.println("\nDigite una opcion: ");
                                 raza1=leer2.nextInt();
                            } catch (Exception e) {
                                System.err.println("\nNo ingresó un numero\n");
                            }
        
         while(raza!=1 && raza!=2 && raza!=3) {
            
             try {
                                System.out.println("\nDigite una opcion: ");
                                 raza1=leer2.nextInt();
                            } catch (Exception e) {
                                System.err.println("\nNo ingresó un numero\n");
                                raza=1;
                            }
            
        }
    
        int contador=1, fase=1;
        Jugador jugador2=new Jugador(2, raza1,mando2,genoro2,genel2,gengem2,entre2,ve12,ve22, entrenadas2,atac2,defendiendo2,unicoM2);
        Menu menu = new Menu(contador, jugador1, jugador2);
        Menu menu2 = new Menu(contador, jugador2, jugador1);
      
        while(cont!=-1){
            if(cont%2==0){ 
                menu.defensores();
                menu.fase_generadores();
                menu.soldado();
                menu.Automatico();
                
                menu.menuJugador();
                cont=jugador1.fase(cont);
            }
            else{ 
                menu2.defensores();
                menu2.fase_generadores();
                menu2.soldado();
                menu2.Automatico();
                
                menu2.menuJugador();
                cont=jugador2.fase(cont);
            }
        }
    }
    
}
