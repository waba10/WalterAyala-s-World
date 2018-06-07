/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import Magos.Mago;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP PC
 */
public class Menu {
    public ArrayList<Mago> generador_oro=new ArrayList<>();
    public ArrayList<Mago> generador_elixir=new ArrayList<>();
    public ArrayList<Mago> generador_gema=new ArrayList<>();
    public ArrayList<Mago> entrenar=new ArrayList<>();
    public ArrayList<Mago> vehiculo1=new ArrayList<>();
    public ArrayList<Mago> vehiculo2=new ArrayList<>();
    public int contador;
    public Jugador jugador;
    public static Menu menu;
    
     public Menu() {
    }

    public Menu(Jugador jugador,int contador) {
        this.jugador = jugador;
        this.contador=contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
     
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

     
    public ArrayList<Mago> getGenerador_oro() {
        return generador_oro;
    }

    public void setGenerador_oro(ArrayList<Mago> generador_oro) {
        this.generador_oro = generador_oro;
    }

    public ArrayList<Mago> getGenerador_elixir() {
        return generador_elixir;
    }

    public void setGenerador_elixir(ArrayList<Mago> generador_elixir) {
        this.generador_elixir = generador_elixir;
    }

    public ArrayList<Mago> getGenerador_gema() {
        return generador_gema;
    }

    public void setGenerador_gema(ArrayList<Mago> generador_gema) {
        this.generador_gema = generador_gema;
    }

    
    
    
    public static Menu getInstance(){
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }
    
    public void menuJugador(){
        int opc=0;
        do{
            System.out.println("\n********JUGADOR********");
            System.out.println("1. Recoger Oro");
            System.out.println("2. Recoger Gemas");
            System.out.println("3. Atacar al rival");
            System.out.println("4. Defender ataque");
            System.out.println("5. Crear generador de Oro");
            System.out.println("6. Crear generador de elixir"); 
            System.out.println("7. Crear generador de gemas"); 
            System.out.println("8. Crear edificacion para entrenar soldados y escuadrones");
            System.out.println("9. Crear edificación para vehiculos 1");
            System.out.println("10. Crear edificación para vehiculos tipo 2");
            System.out.println("11. Mejorar centro de Mando");
            System.out.println("12. Fin del turno");
            AbstractFactory factory;
            factory = Produccion.getFactory("Magos");
            Mago oro1 = factory.getMagos("Generador de Oro");
            Mago elixir1 = factory.getMagos("Generador de Elixir");
            Mago gema1 = factory.getMagos("Generador de Gema");
            
            
            /*if(contador==1){
                if(generador_oro.size()>0){
                    for (int i = 0; i < generador_oro.size(); i++) {
                        oro1=generador_oro.get(i);
                        oro1.generar();
                
                    }
                setContador(0);
                }
                
            }*/
            
            
        
            Scanner leer = new Scanner(System.in);
            
        
        
            
            try{
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            
            switch(opc){    
                case 1:
                    for (int i = 0; i < generador_oro.size(); i++) {
                        oro1 = generador_oro.get(i);
                        int num = oro1.recolectar();
                        int num1 = getJugador().getMando().getOro();
                        int sum = num + num1;
                        getJugador().getMando().setOro(sum);
                        //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

                    }
                    System.out.println("Se recogió y se obtuvo esta cantidad total en el centro de mando de oro " + getJugador().getMando().getOro());
      
                   
                    break;
                case 2:
                    for (int i = 0; i < generador_gema.size(); i++) {
                        gema1 = generador_gema.get(i);
                        int num = gema1.recolectar();
                        int num1 = getJugador().getMando().getGema();
                        int sum = num + num1;
                        getJugador().getMando().setGema(sum);
                        //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

                    }
                    System.out.println("Se recogió y se obtuvo esta cantidad total en el centro de mando de  gemas " + getJugador().getMando().getGema());
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                    factory = Produccion.getFactory("Magos");
                    Mago oro = factory.getMagos("Generador de Oro");
                    generador_oro.add(oro);
                    System.out.println("Se construyó un generador de oro");
                    break;
                case 6:
                    factory = Produccion.getFactory("Magos");
                    Mago elixir = factory.getMagos("Generador de Elixir");
                    generador_elixir.add(elixir);
                    System.out.println("Se construyó un generador de Elixir");
                    break;
                case 7:
                    factory = Produccion.getFactory("Magos");
                    Mago gema = factory.getMagos("Generador de Gema");
                    generador_gema.add(gema);
                    System.out.println("Se construyó un generador de gema");
                    break;
                case 8:
                    factory = Produccion.getFactory("Magos");
                    Mago entrena = factory.getMagos("Entrenador");
                    entrenar.add(entrena);
                    System.out.println("Se construyó una edificación para entrenar");
                    
                    break;
                case 9:
                    factory = Produccion.getFactory("Magos");
                    Mago veh1 = factory.getMagos("Alfombra");
                    vehiculo1.add(veh1);
                    System.out.println("Se construyó un vehiculo tipo 1");
                    break;
                    
                case 10:
                    factory = Produccion.getFactory("Magos");
                    Mago veh2 = factory.getMagos("Caballo");
                    vehiculo2.add(veh2);
                    System.out.println("Se construyó un vehiculo tipo 2");
                    break;
                case 11:
                    if(getJugador().getMando().getOro()==250 && getJugador().getMando().getElixir()==250 && getJugador().getMando().getGema()==250)
                    getJugador().getMando().level();
                    System.out.println("El valor ahora de Oro es de " + getJugador().getMando().getCapacidad1());
                    System.out.println("El valor ahora de Elixir es de "+ getJugador().getMando().getCapacidad2());
                    System.out.println("El valor ahora de Gema es de "+ getJugador().getMando().getCapacidad3());
                    break;
                    
                case 12:
                    for (int i = 0; i < generador_elixir.size(); i++) {
                        elixir1 = generador_elixir.get(i);
                        int num = elixir1.recolectar();
                        int num1 = getJugador().getMando().getElixir();
                        int sum = num + num1;
                        getJugador().getMando().setElixir(sum);
                        //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

                    }
                    System.out.println("Esta recogió y se obtuvo esta cantidad total en el centro de mando de elixir " + getJugador().getMando().getElixir());
                    for (int i = 0; i < generador_oro.size(); i++) {
                        oro1=generador_oro.get(i);
                        oro1.generar();
                
                    }
                    for (int i = 0; i < generador_elixir.size(); i++) {
                        elixir1=generador_elixir.get(i);
                        elixir1.generar();
                
                    }
                    for (int i = 0; i < generador_gema.size(); i++) {
                        gema1=generador_gema.get(i);
                        gema1.generar();
                
                    }
                    System.out.println("Tienes "+ entrenar.size() + " Para entrenar tropas");
                    System.out.println("Tienes "+ vehiculo1.size() + " vehiculo tipo 1");
                    System.out.println("Tienes "+ vehiculo2.size() + " vehiculo tipo 2 ");
                    //cont=cont+1;
                    //System.exit(0);
                    break;
                default:
                     System.out.println("");
            }
        }while(opc!=12);       
    }
}
