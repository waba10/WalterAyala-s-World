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
    public ArrayList<Mago> escuadronm=new ArrayList<Mago>();
    Mago[] unicoM=new Mago[1];
    public int contador;
    public Jugador jugador;
    public Jugador otro;
    public static Menu menu;
    
     public Menu() {
    }

    public Menu(int contador, Jugador jugador, Jugador otro) {
        this.contador = contador;
        this.jugador = jugador;
        this.otro = otro;
    }

    public Jugador getOtro() {
        return otro;
    }

    public void setOtro(Jugador otro) {
        this.otro = otro;
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
            System.out.println("12. Entrenar tropas");
            System.out.println("13. Fin del turno");
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
                    for (int i = 0; i <getJugador().getRe1().size(); i++) {
                        
                        oro1 = getJugador().getRe1().get(i);
                        int num = oro1.recolectar();
                        System.out.println("Esto se obtuvo en "+i+" interaccion "+ num);
                        int num1 = getJugador().getMando().getOro();
                        int sum = num + num1;
                        getJugador().getMando().setOro(sum);
                        //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

                    }
                    System.out.println("Se recogió y se obtuvo esta cantidad total en el centro de mando de oro " + getJugador().getMando().getOro());
      
                   
                    break;
                case 2:
                    for (int i = 0; i < getJugador().getRe3().size(); i++) {
                        gema1 = getJugador().getRe3().get(i);
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
                    getJugador().getRe1().add(oro);
                    //generador_oro.add(oro);
                    System.out.println("Se construyó un generador de oro");
                    break;
                case 6:
                    factory = Produccion.getFactory("Magos");
                    Mago elixir = factory.getMagos("Generador de Elixir");
                    getJugador().getRe2().add(elixir);
                    //generador_elixir.add(elixir);
                    System.out.println("Se construyó un generador de Elixir");
                    break;
                case 7:
                    factory = Produccion.getFactory("Magos");
                    Mago gema = factory.getMagos("Generador de Gema");
                    getJugador().getRe3().add(gema);
                    //generador_gema.add(gema);
                    System.out.println("Se construyó un generador de gema");
                    break;
                case 8:
                    factory = Produccion.getFactory("Magos");
                    Mago entrena = factory.getMagos("Entrenador");
                    entrena.estado();
                    getJugador().getEntrenador().add(entrena);
                    //entrenar.add(entrena);
                    System.out.println("Se construyó una edificación para entrenar");
                    
                    break;
                case 9:
                    factory = Produccion.getFactory("Magos");
                    Mago veh1 = factory.getMagos("Alfombra");
                    getJugador().getVehiculo1().add(veh1);
                    //vehiculo1.add(veh1);
                    System.out.println("Se construyó un vehiculo tipo 1");
                    break;
                    
                case 10:
                    factory = Produccion.getFactory("Magos");
                    Mago veh2 = factory.getMagos("Caballo");
                    getJugador().getVehiculo2().add(veh2);
                    //vehiculo2.add(veh2);
                    System.out.println("Se construyó un vehiculo tipo 2");
                    break;
                case 11:
                    int cap1=getJugador().getMando().getCapacidad1();
                    int cap2=getJugador().getMando().getCapacidad2();
                    int cap3=getJugador().getMando().getCapacidad3();
                    double ca=cap1+(cap1*0.10); 
                    double ce=cap2+(cap2*0.30); 
                    double ci=cap3+(cap3*0.50); 
                    double sum= (ca+ce+ci);
                    sum=sum*0.25;
                    sum=(int)sum/3;
                    
                    System.out.println(sum);
                    
                    if (getJugador().getMando().getOro() >= sum && getJugador().getMando().getElixir() >= sum && getJugador().getMando().getGema() >= sum) {
                        getJugador().getMando().level();
                        System.out.println("El valor ahora de Oro es de " + getJugador().getMando().getCapacidad1());
                        System.out.println("El valor ahora de Elixir es de " + getJugador().getMando().getCapacidad2());
                        System.out.println("El valor ahora de Gema es de " + getJugador().getMando().getCapacidad3());
                    }
                    else{
                        System.out.println("No dispone de suficientes recursos");
                    }
                    break;
                    
                case 12:
                    int k = 0;
                    boolean sta = false;
                    factory = Produccion.getFactory("Magos");
                    Mago entrenad = factory.getMagos("Entrenador");
                    if (getJugador().getEntrenador().size() > 0) {
                        while (sta != true || k==getJugador().getEntrenador().size()) {
                            entrenad = getJugador().getEntrenador().get(k);
                            //sta=entrenad.getEstado();
                            k = k + 1;
                        }
                        if (entrenad.estado() == true) {
                            System.out.println("¿Qué numero de tropa desea entrenar?");
                            System.out.println("1. Escuadron M");
                            System.out.println("2. Merlin");
                            Scanner leer2 = new Scanner(System.in);
                            int op = leer2.nextInt();
                            if (op == 1) {
                                factory = Produccion.getFactory("Magos");
                                Mago escua = factory.getMagos("EscuadronM");
                                escua.entrenar();
                                escuadronm.add(escua);
                                System.out.println("Se entrenó un EscuadonM");
                            } else if (op == 2) {
                                if (unicoM[0] == null) {
                                    factory = Produccion.getFactory("Magos");
                                    Mago me = factory.getMagos("Merlin");
                                    unicoM[0] = me;
                                    System.out.println("Se entrenó a Merlin");
                                } else {
                                    System.out.println("Solo se puede tener a un Merlin entrenado");
                                }
                            } else {
                                System.out.println("No eligió ninguna opción");
                            }
                        } else {
                            System.out.println("No hay edificación para entrenar disponible");
                        }
                    } else {
                        System.out.println("No tiene edificaciones de entrenamiento");
                    }


                    
                    break;
                    
                case 13:
                    for (int i = 0; i < getJugador().getRe2().size(); i++) {
                        elixir1 = getJugador().getRe2().get(i);
                        int num = elixir1.recolectar();
                        int num1 = getJugador().getMando().getElixir();
                        int sum2 = num + num1;
                        getJugador().getMando().setElixir(sum2);
                        //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

                    }
                    System.out.println("Esta recogió y se obtuvo esta cantidad total en el centro de mando de elixir " + getJugador().getMando().getElixir());
                    for (int i = 0; i < getJugador().getRe1().size(); i++) {
                        System.out.println("Se hizo la generacion "+i);
                        oro1=getJugador().getRe1().get(i);
                        oro1.generar();
                
                    }
                    for (int i = 0; i < getJugador().getRe2().size(); i++) {
                        elixir1=getJugador().getRe2().get(i);
                        elixir1.generar();
                
                    }
                    for (int i = 0; i < getJugador().getRe3().size(); i++) {
                        gema1=getJugador().getRe3().get(i);
                        gema1.generar();
                
                    }
                    System.out.println("Tienes "+ getJugador().getEntrenador().size() + " Para entrenar tropas");
                    System.out.println("Tienes "+ getJugador().getVehiculo1().size() + " vehiculo tipo 1");
                    System.out.println("Tienes "+ getJugador().getVehiculo2().size() + " vehiculo tipo 2 ");
                    //cont=cont+1;
                    //System.exit(0);
                    break;
                default:
                     System.out.println("");
            }
        }while(opc!=13);       
    }
}
