/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import Magos.Mago;
import RecursosMagos.GeneradorOro;
import RecursosMagos.RecolectorOro;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP PC
 */
public class Menu {
    public ArrayList<Mago> generador_oro=new ArrayList<>();
    public ArrayList<RecolectorOro> recolector_oro=new ArrayList<>();
    public static Menu menu;
    
     public Menu() {
    }

    public ArrayList<Mago> getGenerador_oro() {
        return generador_oro;
    }

    public void setGenerador_oro(ArrayList<Mago> generador_oro) {
        this.generador_oro = generador_oro;
    }

    public ArrayList<RecolectorOro> getRecolector_oro() {
        return recolector_oro;
    }

    public void setRecolector_oro(ArrayList<RecolectorOro> recolector_oro) {
        this.recolector_oro = recolector_oro;
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
            System.out.println("3. Recoger Elixir");
            System.out.println("4. Atacar al rival");
            System.out.println("5. Defender ataque");
            System.out.println("6. Crear generador de Oro");
            System.out.println("7. Crear generador de elixir"); 
            System.out.println("8. Crear generador de gemas"); 
            System.out.println("9. Crear edificacion para entrenar soldados y escuadrones");
            System.out.println("10. Crear edificación para vehiculos 1");
            System.out.println("11. Crear edificación para vehiculos tipo 2");
            System.out.println("12. Mejorar centro de Mando");
            System.out.println("13. Actualizar");
            System.out.println("14. Fin del turno");
            AbstractFactory factory;
            factory = Produccion.getFactory("Magos");
            Mago oro1 = factory.getMagos("Generador de Oro");
            Mago oro2= factory.getMagos("Recolector de Oro");
            for (int i = 0; i < generador_oro.size(); i++) {
                oro1=generador_oro.get(i);
                oro1.generar();
                
            }
        
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
                    oro1=generador_oro.get(i);
                    oro2.recolectar();
                    oro1.generar();
                
            }
                    
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    factory = Produccion.getFactory("Magos");
                    Mago oro = factory.getMagos("Generador de Oro");
                    generador_oro.add(oro);
                    
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 14:
                    //cont=cont+1;
                    //System.exit(0);
                    break;
                default:
                     System.out.println("");
            }
        }while(opc!=14);       
    }
}
