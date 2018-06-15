/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Razas.Raza;

/**
 *
 * @author HP PC
 */
public class Menu {
    
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

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    public void defensores(){
         int ataque1 = 5, ataque2 = 10;
        AbstractFactory factory;
        factory = Produccion.getFactory("Magos");
        Raza oro1 = factory.getMagos("Generador de Oro");
        Raza elixir1 = factory.getMagos("Generador de Elixir");
        Raza gema1 = factory.getMagos("Generador de Gema");
        Raza es2 = factory.getMagos("EscuadronM");
        Raza solo=factory.getMagos("Merlin");
        for (int i = 0; i < getJugador().getDefendiendo().size(); i++) {
            es2 = getJugador().getDefendiendo().get(i);
            if (es2.lista() == 8) {
                int pos = es2.posicion();
               
                if (getOtro().getAtacando().get(pos).vida() < 1) {
                    System.out.println("Se destruyó la tropa enemiga " + pos);
                    getOtro().getAtacando().remove(pos);
                    es2.modificar_posicion(0);
                    es2.modificar_lista(0);
                    
                    getJugador().getEntrenadas().add(es2);
                    

                } else {
                    System.out.println("Sigue con vida la tropa enemiga " + pos);
                     if (getJugador().getRaza() == 3) {
                    getOtro().getAtacando().get(pos).modificar_vida(ataque1 * 2);
                } else {
                    getOtro().getAtacando().get(pos).modificar_vida(ataque1);
                }
                }
            } else if (es2.lista() == 9) {
                int pos = es2.posicion();
                
                
                if (getOtro().getUnicoM().get(pos).vida() < 1) {
                    System.out.println("Se destruyó el super soldado " + pos);
                    getOtro().getUnicoM().remove(pos);
                    es2.modificar_posicion(0);
                    es2.modificar_lista(0);
                    getJugador().getEntrenadas().add(es2);
                    

                } else {
                    if (getJugador().getRaza() == 3) {
                    getOtro().getUnicoM().get(pos).modificar_vida(ataque1 * 2);
                } else {
                    getOtro().getUnicoM().get(pos).modificar_vida(ataque1);
                }
                    System.out.println("Sigue con vida el super soldado" + pos);
                }
            
            }
    }
    }

    public void fase_generadores(){
        AbstractFactory factory;
        factory = Produccion.getFactory("Magos");
        Raza oro1 = factory.getMagos("Generador de Oro");
        Raza elixir1 = factory.getMagos("Generador de Elixir");
        Raza gema1 = factory.getMagos("Generador de Gema");
        for (int i = 0; i < getJugador().getRe2().size(); i++) {
            elixir1 = getJugador().getRe2().get(i);
            if (getJugador().getRaza() == 1) {
                elixir1.generar_doble();
            } else {
                elixir1.generar();
            }
        }
        for (int i = 0; i < getJugador().getRe1().size(); i++) {
            oro1 = getJugador().getRe1().get(i);
            if (getJugador().getRaza() == 1) {
                oro1.generar_doble();
            } else {
                oro1.generar();
            }

        }

        for (int i = 0; i < getJugador().getRe3().size(); i++) {
            gema1 = getJugador().getRe3().get(i);
            if (getJugador().getRaza() == 1) {
                gema1.generar_doble();
            } else {
                gema1.generar();
            }

        }
        
    }
    public void Automatico() {
        int ataque1 = 5, ataque2 = 10;
        AbstractFactory factory;
        factory = Produccion.getFactory("Magos");
        Raza oro1 = factory.getMagos("Generador de Oro");
        Raza elixir1 = factory.getMagos("Generador de Elixir");
        Raza gema1 = factory.getMagos("Generador de Gema");
        Raza es2 = factory.getMagos("EscuadronM");

        
        for (int i = 0; i < getJugador().getRe2().size(); i++) {
            elixir1 = getJugador().getRe2().get(i);
            int num = elixir1.recolectar();
            int num1 = getJugador().getMando().getElixir();
            int sum2 = num + num1;
            getJugador().getMando().setElixir(sum2);
            //System.out.println("Esta esta cantidad de oro " + getJugador().getMando().getOro());

        }
        
        for (int i = 0; i < getJugador().getAtacando().size(); i++) {
            es2 = getJugador().getAtacando().get(i);
            if (es2.lista() == 1) {
                int pos = es2.posicion();
                if (getJugador().getRaza() == 3) {
                    getOtro().getRe1().get(pos).modificar_vida(ataque1 * 2);
                } else {
                    getOtro().getRe1().get(pos).modificar_vida(ataque1);
                }
                if (getOtro().getRe1().get(pos).vida() < 1) {
                    System.out.println("Se destruyó el generador " + pos);
                    getOtro().getRe1().remove(pos);
                    System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                    getJugador().getEntrenadas().add(es2);
                    getJugador().getAtacando().remove(i);

                } else {
                    System.out.println("Sigue con vida el generador de oro numero " + pos);
                }
            } else if (es2.lista() == 2) {
                int pos = es2.posicion();
                if (getJugador().getRaza() == 3) {
                    getOtro().getRe2().get(pos).modificar_vida(ataque1 * 2);
                } else {
                    getOtro().getRe2().get(pos).modificar_vida(ataque1);
                }
                if (getOtro().getRe2().get(pos).vida() < 1) {
                    System.out.println("Se destruyó el generador " + pos);
                    getOtro().getRe2().remove(pos);
                    System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                    getJugador().getEntrenadas().add(es2);
                    getJugador().getAtacando().remove(i);

                } else {
                    System.out.println("Sigue con vida el generador de elixir numero " + pos);
                }
            } else if (es2.lista() == 3) {
                int pos = es2.posicion();
                if (getJugador().getRaza() == 3) {
                    getOtro().getRe3().get(pos).modificar_vida(ataque1 * 2);
                } else {
                    getOtro().getRe3().get(pos).modificar_vida(ataque1);
                }
                if (getOtro().getRe3().get(pos).vida() < 1) {
                    System.out.println("Se destruyó el generador " + pos);
                    getOtro().getRe3().remove(pos);
                    System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                    getJugador().getEntrenadas().add(es2);
                    getJugador().getAtacando().remove(i);

                } else {
                    System.out.println("Sigue con vida el generador de gemas número " + pos);
                }
            } else if (es2.lista() == 4) {
                int pos = es2.posicion();
                if (getJugador().getRaza() == 3) {
                    getOtro().getEntrenador().get(pos).modificar_vida(ataque1 * 2);
                } else {
                    getOtro().getEntrenador().get(pos).modificar_vida(ataque1);
                }
                if (getOtro().getEntrenador().get(pos).vida() < 1) {
                    System.out.println("Se destruyó el  edificio de entrenamiento " + pos);
                    getOtro().getEntrenador().remove(pos);
                    System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                    getJugador().getEntrenadas().add(es2);
                    getJugador().getAtacando().remove(i);

                } else {
                    System.out.println("Sigue con vida el edificio de entrenamiento numero " + pos);
                }
            } else if (es2.lista() == 5) {
                int pos = es2.posicion();
                if (getJugador().getRaza() == 3) {
                    getOtro().getVehiculo1().get(pos).modificar_vida(ataque1 * 2);
                } else {
                    getOtro().getVehiculo1().get(pos).modificar_vida(ataque1);
                }
                if (getOtro().getVehiculo1().get(pos).vida() < 1) {
                    System.out.println("Se destruyó el  edificio de vehiculos tipo 1 numero " + pos);
                    getOtro().getVehiculo1().remove(pos);
                    System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                    getJugador().getEntrenadas().add(es2);
                    getJugador().getAtacando().remove(i);

                } else {
                    System.out.println("Sigue con vida el edificio de vehiculo tipo 1 numero " + pos);
                }
            } else if (es2.lista() == 6) {
                int pos = es2.posicion();
                if (getJugador().getRaza() == 3) {
                    getOtro().getVehiculo2().get(pos).modificar_vida(ataque1 * 2);
                } else {
                    getOtro().getVehiculo2().get(pos).modificar_vida(ataque1);
                }
                if (getOtro().getVehiculo2().get(pos).vida() < 1) {
                    System.out.println("Se destruyó el  edificio de vehiculos tipo 2 numero " + pos);
                    getOtro().getVehiculo2().remove(pos);
                    System.out.println("El escuadron se pondrá a su disposición para un nuevo ataque");
                    getJugador().getEntrenadas().add(es2);
                    getJugador().getAtacando().remove(i);

                } else {
                    System.out.println("Sigue con vida el edificio de vehiculo tipo 2 numero " + pos);
                }
            } else if (es2.lista() == 7) {
                int vida;
                vida = getOtro().getMando().getVida();
                if (getJugador().getRaza() == 3) {
                    getOtro().getMando().setVida(vida - (ataque1 * 2));
                } else {
                    getOtro().getMando().setVida(vida - ataque1);
                }
                if (getOtro().getMando().getVida() < 1) {
                    System.out.println("Se destruyó el  Centro de Mando del rival");
                    System.exit(0);

                } else {
                    System.out.println("Sigue con vida el Centro de Mando");
                }
            }

        }
        

    }
    
    public void soldado(){
        int ataque1 = 5, ataque2 = 10;
        AbstractFactory factory;
        factory = Produccion.getFactory("Magos");
        if (getJugador().getUnicoM().size()==1) {
            Raza es3 = factory.getMagos("Merlin");
            es3=getJugador().getUnicoM().get(0);
            int lista = es3.lista();
            int posici=es3.posicion();
            switch (lista) {

                case 1:
                    
                    if (getOtro().getRe1().get(posici).vida() < 1) {
                        System.out.println("Se destruyó el generador " + posici);
                        getOtro().getRe1().remove(posici);
                        System.out.println("El Super soldado se pondrá a su disposición para un nuevo ataque");
                        int vi = getJugador().getUnicoM().get(0).vida();
                        vi = 25 - vi;
                        getJugador().getUnicoM().remove(0);
                        factory = Produccion.getFactory("Magos");
                        Raza me = factory.getMagos("Merlin");
                        me.modificar_vida(vi);
                        getJugador().getUnicoM().add(me);

                    }
                    else{
                        System.out.println("Sigue con vida el generador "+posici);
                        if (getJugador().getRaza() == 3) {
                        getOtro().getRe1().get(posici).modificar_vida(ataque2 * 2);
                    } else {
                        getOtro().getRe1().get(posici).modificar_vida(ataque2);
                    }
                    }
                    break;
                case 2:
                   
                    if (getOtro().getRe2().get(posici).vida() < 1) {
                        System.out.println("Se destruyó el generador " + posici);
                        getOtro().getRe2().remove(posici);
                        System.out.println("El Super soldado se pondrá a su disposición para un nuevo ataque");
                        int vi = getJugador().getUnicoM().get(0).vida();
                        vi = 25 - vi;
                        getJugador().getUnicoM().remove(0);
                        factory = Produccion.getFactory("Magos");
                        Raza me = factory.getMagos("Merlin");
                        me.modificar_vida(vi);
                        getJugador().getUnicoM().add(me);

                    }else{
                        
                         if (getJugador().getRaza() == 3) {
                        getOtro().getRe2().get(posici).modificar_vida(ataque2 * 2);
                    } else {
                        getOtro().getRe2().get(posici).modificar_vida(ataque2);
                    }
                        System.out.println("Sigue con vida el generador "+posici);
                        
                    }
                    
                    break;
                case 3:
                    
                    if (getOtro().getRe3().get(posici).vida() < 1) {
                        System.out.println("Se destruyó el generador " + posici);
                        getOtro().getRe3().remove(posici);
                        System.out.println("El Super soldado se pondrá a su disposición para un nuevo ataque");
                        int vi = getJugador().getUnicoM().get(0).vida();
                        vi = 25 - vi;
                        getJugador().getUnicoM().remove(0);
                        factory = Produccion.getFactory("Magos");
                        Raza me = factory.getMagos("Merlin");
                        me.modificar_vida(vi);
                        getJugador().getUnicoM().add(me);

                    }else{
                        if (getJugador().getRaza() == 3) {
                        getOtro().getRe3().get(posici).modificar_vida(ataque2 * 2);
                    } else {
                        getOtro().getRe3().get(posici).modificar_vida(ataque2);
                    }
                        System.out.println("Sigue con vida el generador "+posici);
                    }
                    break;
                case 4:
                    
                    if (getOtro().getEntrenador().get(posici).vida() < 1) {
                        System.out.println("Se destruyó la edificacion de entrenamiento " + posici);
                        getOtro().getEntrenador().remove(posici);
                        System.out.println("El Super soldado se pondrá a su disposición para un nuevo ataque");
                        int vi = getJugador().getUnicoM().get(0).vida();
                        vi = 25 - vi;
                        getJugador().getUnicoM().remove(0);
                        factory = Produccion.getFactory("Magos");
                        Raza me = factory.getMagos("Merlin");
                        me.modificar_vida(vi);
                        getJugador().getUnicoM().add(me);

                    }else{
                        if (getJugador().getRaza() == 3) {
                        getOtro().getEntrenador().get(posici).modificar_vida(ataque2 * 2);
                    } else {
                        getOtro().getEntrenador().get(posici).modificar_vida(ataque2);
                    }
                        System.out.println("Sigue con vida la edificacion de entrenamiento "+posici);
                    }
                    break;
                case 5:
                    
                    if (getOtro().getVehiculo1().get(posici).vida() < 1) {
                        System.out.println("Se destruyó la edificacion de vehiculos 1 " + posici);
                        getOtro().getVehiculo1().remove(posici);
                        System.out.println("El Super soldado se pondrá a su disposición para un nuevo ataque");
                        int vi = getJugador().getUnicoM().get(0).vida();
                        vi = 25 - vi;
                        getJugador().getUnicoM().remove(0);
                        factory = Produccion.getFactory("Magos");
                        Raza me = factory.getMagos("Merlin");
                        me.modificar_vida(vi);
                        getJugador().getUnicoM().add(me);

                    }else{
                        if (getJugador().getRaza() == 3) {
                        getOtro().getVehiculo1().get(posici).modificar_vida(ataque2 * 2);
                    } else {
                        getOtro().getVehiculo1().get(posici).modificar_vida(ataque2);
                    }
                        System.out.println("Sigue con vida la edificacion de vehiculo tipo 1 numero "+posici);
                    }
                    break;
                case 6:
                    
                    if (getOtro().getVehiculo2().get(posici).vida() < 1) {
                        System.out.println("Se destruyó la edificacion de vehiculos 2 " + posici);
                        getOtro().getVehiculo2().remove(posici);
                        System.out.println("El Super soldado se pondrá a su disposición para un nuevo ataque");
                        int vi = getJugador().getUnicoM().get(0).vida();
                        vi = 25 - vi;
                        getJugador().getUnicoM().remove(0);
                        factory = Produccion.getFactory("Magos");
                        Raza me = factory.getMagos("Merlin");
                        me.modificar_vida(vi);
                        getJugador().getUnicoM().add(me);

                    }
                    else{
                        if (getJugador().getRaza() == 3) {
                        getOtro().getVehiculo2().get(posici).modificar_vida(ataque2 * 2);
                    } else {
                        getOtro().getVehiculo2().get(posici).modificar_vida(ataque2);
                    }
                        System.out.println("Sigue con vida la edificacion de vehiculo tipo 2 numero "+posici);
                    }
                    break;
                case 7:
                    int vida;
                    vida = getOtro().getMando().getVida();
                    
                    if (getOtro().getMando().getVida() < 1) {
                        System.out.println("Se destruyó el  Centro de Mando del rival");
                        System.exit(0);

                    } else {
                        if (getJugador().getRaza() == 3) {
                        getOtro().getMando().setVida(vida - (ataque2 * 2));
                    } else {
                        getOtro().getMando().setVida(vida - ataque2);
                    }
                        System.out.println("Sigue con vida el Centro de Mando");
                    }
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("");
        }
    }

    public void Menumag() {
        System.out.println("El Oro a su disposicion es " + getJugador().getMando().getOro());
        System.out.println("El Elixir a su disposicion es " + getJugador().getMando().getElixir());
        System.out.println("Las Gemas a su disposicion es " + getJugador().getMando().getGema());
        System.out.println("\n********JUGADOR********");
        System.out.println("1. Recoger Oro");
        System.out.println("2. Recoger Gemas");
        System.out.println("3. Atacar al rival");
        System.out.println("4. Defender ataque");
        System.out.println("5. Crear generador de Oro (210 gema & 60 elixir)");
        System.out.println("6. Crear generador de elixir (210 oro & 60 gema");
        System.out.println("7. Crear generador de gemas (210 elixir & 60 oro");
        System.out.println("8. Crear edificacion para entrenar soldados y escuadrones (210 gema & 60 elixir)");
        System.out.println("9. Crear edificación para vehiculos 1 (210 oro & 60 gema)");
        System.out.println("10. Crear edificación para vehiculos tipo 2 (210 elixir & 60 oro)");
        System.out.println("11. Mejorar centro de Mando");
        System.out.println("12. Entrenar tropas");
        System.out.println("13. Fin del turno");
        System.out.println("14. Rendirse");
    }

    public void MenuGi() {
        System.out.println("La Plata a su disposicion es " + getJugador().getMando().getOro());
        System.out.println("La Posion a su disposicion es " + getJugador().getMando().getElixir());
        System.out.println("Los Rubies a su disposicion es " + getJugador().getMando().getGema());
        System.out.println("\n********JUGADOR********");
        System.out.println("1. Recoger Plata");
        System.out.println("2. Recoger Rubi");
        System.out.println("3. Atacar al rival");
        System.out.println("4. Defender ataque");
        System.out.println("5. Crear generador de Plata (210 rubi & 60 posion)");
        System.out.println("6. Crear generador de Posion (210 plata & 60 rubi)");
        System.out.println("7. Crear generador de Rubi (210 posion & 60 plata)");
        System.out.println("8. Crear edificacion para entrenar soldados y escuadrones (210 rubi & 60 posion )");
        System.out.println("9. Crear edificación para vehiculos 1 (210 plata & 60 rubi)");
        System.out.println("10. Crear edificación para vehiculos tipo 2 (210 posion & 60 plata)");
        System.out.println("11. Mejorar centro de Mando");
        System.out.println("12. Entrenar tropas");
        System.out.println("13. Fin del turno");
        System.out.println("14. Rendirse");
    }

    public void MenuDra() {
        System.out.println("El Bronce a su disposicion es " + getJugador().getMando().getOro());
        System.out.println("La Lava a su disposicion es " + getJugador().getMando().getElixir());
        System.out.println("Los Diamantes a su disposicion es " + getJugador().getMando().getGema());
        System.out.println("\n********JUGADOR********");
        System.out.println("1. Recoger Bronce");
        System.out.println("2. Recoger Diamante");
        System.out.println("3. Atacar al rival");
        System.out.println("4. Defender ataque");
        System.out.println("5. Crear generador de Bronce (210 diamante & 60 lava)");
        System.out.println("6. Crear generador de Lava  (210 bronce & 60 diamante)");
        System.out.println("7. Crear generador de Diamante (210 lava & 60 bronce)");
        System.out.println("8. Crear edificacion para entrenar soldados y escuadrones (210 diamante & 60 lava)");
        System.out.println("9. Crear edificación para vehiculos 1 (210 bronce & 60 diamante)");
        System.out.println("10. Crear edificación para vehiculos tipo 2 (210 lava & 60 bronce)");
        System.out.println("11. Mejorar centro de Mando");
        System.out.println("12. Entrenar tropas");
        System.out.println("13. Fin del turno");
        System.out.println("14. Rendirse");
    }

    public void menuJugador() {
        int opc = 0, ataque1 = 5, ataque2 = 10;
        do {
            if (1 == (getJugador().getRaza())) {
                Menumag();
            }

            if (2 == (getJugador().getRaza())) {
                MenuDra();
            }
            if (3 == (getJugador().getRaza())) {
                MenuGi();
            }
            int precio1 = 210, precio2 = 60;

            AbstractFactory factory;
            factory = Produccion.getFactory("Magos");
            Raza oro1 = factory.getMagos("Generador de Oro");
            Raza elixir1 = factory.getMagos("Generador de Elixir");
            Raza gema1 = factory.getMagos("Generador de Gema");
            Raza es2 = factory.getMagos("EscuadronM");

            Scanner leer = new Scanner(System.in);

            try {
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            } catch (Exception e) {
                System.err.println("\nNo ingresó un numero\n");
            }

            switch (opc) {
                case 1:

                    
                    for (int i = 0; i < getJugador().getRe1().size(); i++) {
                        oro1 = getJugador().getRe1().get(i);
                        int num = oro1.recolectar();
                        int num1 = getJugador().getMando().getOro();
                        int sum = num + num1;
                        getJugador().getMando().setOro(sum);
                    }
                    System.out.println("Se recogió");

                    break;
                case 2:

                    for (int i = 0; i < getJugador().getRe3().size(); i++) {
                        gema1 = getJugador().getRe3().get(i);
                        int num = gema1.recolectar();
                        int num1 = getJugador().getMando().getGema();
                        int sum = num + num1;
                        getJugador().getMando().setGema(sum);
                    }
                    System.out.println("Se recogió ");
                    break;
                case 3:
                    if (getJugador().getVehiculo2().size() > 0 || getJugador().getVehiculo1().size() ==1) {

                        if (getJugador().getEntrenadas().size() > 0 || getJugador().getUnicoM().size()==1) {
                            System.out.println("¿Que desea atacar del rival?");
                            System.out.println("1. Generador de Oro");
                            System.out.println("2. Generador de Elixir");
                            System.out.println("3. Generador de Gemas");
                            System.out.println("4. Edificación de entrenamiento");
                            System.out.println("5. Edificacion de vehiculos tipo 1");
                            System.out.println("6. Edificación vehiculos tipo 2");
                            System.out.println("7. Centro de mando");
                            Scanner leern = new Scanner(System.in);
                            Scanner leerv = new Scanner(System.in);
                            int o = 0, v = 0;
                            try {
                                System.out.println("\nDigite una opcion: ");
                                o = leern.nextInt();
                            } catch (Exception e) {
                                System.err.println("\nNo ingresó un numero\n");
                            }

                            int vida1 = 15;
                            int conta = 0;
                            int dis = 1000;
                            int num1 = 1;
                            int num2 = 2;
                            System.out.println("¿En qué tipo de vehiculo desea mandar a sus tropas?");
                            System.out.println("1. Vehiculo de tipo 1");
                            System.out.println("2. Vehiculo de tipo 2");
                            try {
                                System.out.println("\nDigite una opcion: ");
                                v = leerv.nextInt();
                            } catch (Exception e) {
                                System.err.println("\nNo ingresó un numero\n");
                            }
                            System.out.println("¿En qué tipo de vehiculo desea mandar a sus tropas?");
                            System.out.println("1. Vehiculo de tipo 1");
                            System.out.println("2. Vehiculo de tipo 2");
                            while (v != num1 && v != num2) {

                                try {
                                    System.out.println("\nDigite una opcion: ");
                                    v = leerv.nextInt();
                                } catch (Exception e) {
                                    System.err.println("\nNo ingresó un numero\n");
                                v=1;
                            }
                               
                            }

                            factory = Produccion.getFactory("Magos");
                            Raza or1 = factory.getMagos("Generador");

                            switch (o) {
                                case 1:
                                    
                                    if (getOtro().getRe1().size() > 0) {
                                        int cantidad = getOtro().getRe1().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        int pos=0;
                                        System.out.println("¿Cuál de los " + cantidad + " generadores de oro desea atacar?");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                            pos = leern2.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }

                                        pos = pos - 1;
                                        int o2 = 0;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Merlin");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                            o2 = leern.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }

                                        if (o2 == 1) {
                                            if (getJugador().getEntrenadas().size() > 0) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getJugador().getEntrenadas().size();
                                                tam = tam - 1;
                                                factory = Produccion.getFactory("Magos");
                                                Raza es = factory.getMagos("EscuadronM");
                                                es = getJugador().getEntrenadas().get(tam);
                                                es.modificar_lista(1);
                                                es.modificar_posicion(pos);
                                                getJugador().getAtacando().add(es);
                                                getJugador().getEntrenadas().remove(tam);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getRe1().get(pos).modificar_vida(ataque1 * 2);
                                                } else {
                                                    getOtro().getRe1().get(pos).modificar_vida(ataque1);
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getJugador().getUnicoM().size()==1 ) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                getJugador().getUnicoM().get(0).modificar_lista(1);
                                                getJugador().getUnicoM().get(0).modificar_posicion(pos);

                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getRe1().get(pos).modificar_vida(ataque2 * 2);
                                                } else {
                                                    getOtro().getRe1().get(pos).modificar_vida(ataque2);
                                                }
                                                if (getOtro().getRe1().get(pos).vida() < 1) {
                                                    System.out.println("Se destruyó");
                                                } else {
                                                    System.out.println("Sigue con vida");
                                                }

                                            } else {
                                                System.out.println("No tiene a Merlin disponible");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee generadores de Oro");
                                    }
                                    break;

                                case 2:
                                    
                                    if (getOtro().getRe2().size() > 0) {
                                        int cantidad = getOtro().getRe2().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        int pos=0;
                                        System.out.println("¿Cuál de los " + cantidad + " generadores de elixir desea atacar?");
                                         try {
                                            System.out.println("\nDigite una opcion: ");
                                            pos = leern2.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        
                                        pos = pos - 1;
                                        int o2=0;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Merlin");
                                         try {
                                            System.out.println("\nDigite una opcion: ");
                                            o2 = leern.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        o2 = leern.nextInt();
                                        if (o2 == 1) {
                                            if (getJugador().getEntrenadas().size() > 0) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getJugador().getEntrenadas().size();
                                                tam = tam - 1;
                                                factory = Produccion.getFactory("Magos");
                                                Raza es = factory.getMagos("EscuadronM");
                                                es = getJugador().getEntrenadas().get(tam);
                                                es.modificar_lista(2);
                                                es.modificar_posicion(pos);
                                                getJugador().getAtacando().add(es);
                                                getJugador().getEntrenadas().remove(tam);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getRe2().get(pos).modificar_vida(ataque1 * 2);
                                                } else {
                                                    getOtro().getRe2().get(pos).modificar_vida(ataque1);
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getJugador().getUnicoM().size()==1) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }
                                                getJugador().getUnicoM().get(0).modificar_lista(2);
                                                getJugador().getUnicoM().get(0).modificar_posicion(pos);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getRe2().get(pos).modificar_vida(ataque2 * 2);
                                                } else {
                                                    getOtro().getRe2().get(pos).modificar_vida(ataque2);
                                                }

                                            } else {
                                                System.out.println("No tiene a Merlin disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee generadores de Elixir");
                                    }
                                    break;
                                case 3:
                                    if (getOtro().getRe3().size() > 0) {
                                        int pos=0;
                                        int cantidad = getOtro().getRe3().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        System.out.println("¿Cuál de los " + cantidad + " generadores de gema desea atacar?");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                            pos = leern2.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        pos = leern2.nextInt();
                                        pos = pos - 1;
                                        int o2 = 0;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Merlin");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                            o2 = leern.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        
                                        if (o2 == 1) {
                                            if (getJugador().getEntrenadas().size() > 0) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getJugador().getEntrenadas().size();
                                                tam = tam - 1;
                                                factory = Produccion.getFactory("Magos");
                                                Raza es = factory.getMagos("EscuadronM");
                                                es = getJugador().getEntrenadas().get(tam);
                                                es.modificar_lista(3);
                                                es.modificar_posicion(pos);
                                                getJugador().getAtacando().add(es);
                                                getJugador().getEntrenadas().remove(tam);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getRe3().get(pos).modificar_vida(ataque1 * 2);
                                                } else {
                                                    getOtro().getRe3().get(pos).modificar_vida(ataque1);
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getJugador().getUnicoM().size()==1) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }
                                                getJugador().getUnicoM().get(0).modificar_lista(3);
                                                getJugador().getUnicoM().get(0).modificar_posicion(pos);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getRe3().get(pos).modificar_vida(ataque2 * 2);
                                                } else {
                                                    getOtro().getRe3().get(pos).modificar_vida(ataque2);
                                                }

                                            } else {
                                                System.out.println("No tiene a Merlin disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee generadores de Gema");
                                    }
                                    break;

                                case 4:
                                    if (getOtro().getEntrenador().size() > 0) {
                                        int cantidad = getOtro().getEntrenador().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        int pos=0;
                                        System.out.println("¿Cuál de los " + cantidad + " edificios de entrenamiento desea atacar?");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                           pos = leern2.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        
                                        pos = pos - 1;
                                        int o2=0;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Merlin");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                            o2 = leern.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        
                                        if (o2 == 1) {
                                            if (getJugador().getEntrenadas().size() > 0) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getJugador().getEntrenadas().size();
                                                tam = tam - 1;
                                                factory = Produccion.getFactory("Magos");
                                                Raza es = factory.getMagos("EscuadronM");
                                                es = getJugador().getEntrenadas().get(tam);
                                                es.modificar_lista(4);
                                                es.modificar_posicion(pos);
                                                getJugador().getAtacando().add(es);
                                                getJugador().getEntrenadas().remove(tam);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getEntrenador().get(pos).modificar_vida(ataque1 * 2);
                                                } else {
                                                    getOtro().getEntrenador().get(pos).modificar_vida(ataque1);
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getJugador().getUnicoM().size()==1) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }
                                                getJugador().getUnicoM().get(0).modificar_lista(4);
                                                getJugador().getUnicoM().get(0).modificar_posicion(pos);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getEntrenador().get(pos).modificar_vida(ataque2 * 2);
                                                } else {
                                                    getOtro().getEntrenador().get(pos).modificar_vida(ataque2);
                                                }

                                            } else {
                                                System.out.println("No tiene a Merlin disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee edificaciones de entrenamiento");
                                    }
                                    break;
                                case 5:
                                    if (getOtro().getVehiculo1().size() > 0) {
                                        int cantidad = getOtro().getVehiculo1().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        int pos=0;
                                        System.out.println("¿Cuál de los " + cantidad + " vehiculos tipo 1 desea atacar?");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                            pos = leern2.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        
                                        pos = pos - 1;
                                        int o2=0;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Merlin");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                            o2 = leern.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        
                                        if (o2 == 1) {
                                            if (getJugador().getEntrenadas().size() > 0) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getJugador().getEntrenadas().size();
                                                tam = tam - 1;
                                                factory = Produccion.getFactory("Magos");
                                                Raza es = factory.getMagos("EscuadronM");
                                                es = getJugador().getEntrenadas().get(tam);
                                                es.modificar_lista(5);
                                                es.modificar_posicion(pos);
                                                getJugador().getAtacando().add(es);
                                                getJugador().getEntrenadas().remove(tam);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getVehiculo1().get(pos).modificar_vida(ataque1 * 2);
                                                } else {
                                                    getOtro().getVehiculo1().get(pos).modificar_vida(ataque1);
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getJugador().getUnicoM().size()==1) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }
                                                getJugador().getUnicoM().get(0).modificar_lista(5);
                                                getJugador().getUnicoM().get(0).modificar_posicion(pos);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getVehiculo1().get(pos).modificar_vida(ataque2 * 2);
                                                } else {
                                                    getOtro().getVehiculo1().get(pos).modificar_vida(ataque2);
                                                }

                                            } else {
                                                System.out.println("No tiene a Merlin disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee vehiculos de tipo 1");
                                    }
                                    break;
                                case 6:
                                    if (getOtro().getVehiculo2().size() > 0) {
                                        int cantidad = getOtro().getVehiculo2().size();
                                        Scanner leern2 = new Scanner(System.in);
                                        int pos=0;
                                        System.out.println("¿Cuál de los " + cantidad + " vehiculos tipo 2 desea atacar?");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                            pos = leern2.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                      
                                        pos = pos - 1;
                                        int o2=0;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Merlin");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                           o2 = leern.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        
                                        if (o2 == 1) {
                                            if (getJugador().getEntrenadas().size() > 0) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getJugador().getEntrenadas().size();
                                                tam = tam - 1;
                                                factory = Produccion.getFactory("Magos");
                                                Raza es = factory.getMagos("EscuadronM");
                                                es = getJugador().getEntrenadas().get(tam);
                                                es.modificar_lista(6);
                                                es.modificar_posicion(pos);
                                                getJugador().getAtacando().add(es);
                                                getJugador().getEntrenadas().remove(tam);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getVehiculo2().get(pos).modificar_vida(ataque1 * 2);
                                                } else {
                                                    getOtro().getVehiculo2().get(pos).modificar_vida(ataque1);
                                                }

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getJugador().getUnicoM().size()==1) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                getJugador().getUnicoM().get(0).modificar_lista(6);
                                                getJugador().getUnicoM().get(0).modificar_posicion(pos);
                                                //getJugador().getEntrenadas().remove(tam);
                                                if (getJugador().getRaza() == 3) {
                                                    getOtro().getVehiculo2().get(pos).modificar_vida(ataque2 * 2);
                                                } else {
                                                    getOtro().getVehiculo2().get(pos).modificar_vida(ataque2);
                                                }

                                            } else {
                                                System.out.println("No tiene a Merlin disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("El rival no posee vehiculos de tipo 2");
                                    }
                                    break;
                                case 7:
                                    //Terminar este if
                                    if (getOtro().getEntrenador().size() == 0 && getOtro().getRe1().size() == 0 && getOtro().getRe2().size() == 0 && getOtro().getVehiculo1().size() == 0 && getOtro().getVehiculo2().size() == 0 && getOtro().getRe3().size() == 0) {

                                        int o2=0;
                                        System.out.println("¿Con qué desea atacar?");
                                        System.out.println("1. Con el escuadron");
                                        System.out.println("2. Con Merlin");
                                        try {
                                            System.out.println("\nDigite una opcion: ");
                                           o2 = leern.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                        
                                        if (o2 == 1) {
                                            //Este también
                                            if (getJugador().getEntrenadas().size() > 0) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int tam = getJugador().getEntrenadas().size();
                                                tam = tam - 1;
                                                factory = Produccion.getFactory("Magos");
                                                Raza es = factory.getMagos("EscuadronM");
                                                es = getJugador().getEntrenadas().get(tam);
                                                es.modificar_lista(7);
                                                getJugador().getAtacando().add(es);
                                                getJugador().getEntrenadas().remove(tam);
                                                int vida = getOtro().getMando().getVida();
                                                if (getJugador().getRaza() == 3) {
                                                    ataque1 = ataque1 * 2;
                                                } else {
                                                    ataque1 = ataque1 + 0;
                                                }
                                                vida = vida - ataque1;
                                                getOtro().getMando().setVida(vida);
                                                //getOtro().getMando().getVida().modificar_vida(5);

                                            } else {
                                                System.out.println("No tiene escuadrones disponibles");
                                            }
                                        } else if (o2 == 2) {
                                            if (getJugador().getUnicoM().size()==1) {
                                                if (v == 1) {
                                                    if (getJugador().getVehiculo1().size() > 0) {
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 1 así que se le asignará uno de tipo 2 a sus tropas");
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    }
                                                } else {

                                                    if (getJugador().getVehiculo2().size() > 0) {
                                                        getJugador().getVehiculo2().remove(getJugador().getVehiculo2().size() - 1);
                                                    } else {
                                                        System.out.println("No posee vehiculo de tipo 2 así que se le asignará uno de tipo 1 a sus tropas");
                                                        getJugador().getVehiculo1().remove(getJugador().getVehiculo1().size() - 1);
                                                    }
                                                }

                                                int vida = getOtro().getMando().getVida();
                                                if (getJugador().getRaza() == 3) {
                                                    ataque2 = ataque2 * 2;
                                                } else {
                                                    ataque2 = ataque2 + 0;
                                                }
                                                getJugador().getUnicoM().get(0).modificar_lista(7);

                                                vida = vida - ataque2;
                                                getOtro().getMando().setVida(vida);

                                            } else {
                                                System.out.println("No tiene a Merlin disponibles");
                                            }

                                        }

                                    } else {
                                        System.out.println("No has acabado con todas las edificaciones enemigas");
                                    }
                                    break;

                            }

                        } else {
                            System.out.println("No tiene tropas entrenadas");
                        }
                    } else {
                        System.out.println("No tiene vehiculos disponibles para atacar");
                    }
                    break;

                case 4:
                    if (getOtro().getAtacando().size() > 0) {
                        Scanner def = new Scanner(System.in);
                        int op4=0;

                        System.out.println("¿Con qué desea defender?");
                        System.out.println("1. Un escuadron");
                        System.out.println("2. De Merlin");
                        try {
                                            System.out.println("\nDigite una opcion: ");
                                           op4 = def.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                        switch (op4) {
                            case 1:
                                int op41=0;
                                Scanner defop = new Scanner(System.in);
                                System.out.println("¿De qué se desea defender?");
                                System.out.println("1. De un escuadron");
                                System.out.println("2. De un Super soldado");
                                try {
                                            System.out.println("\nDigite una opcion: ");
                                           op41 = defop.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                //System.out.println("Cual de los " + getOtro().getAtacando().size() + " escuadrones del rival desea atacar");
                                
                                //op41 = op41 - 1;
                                if (op41 == 1) {
                                    int escuadr=0;
                                    System.out.println("Cual de los " + getOtro().getAtacando().size() + " escuadrones del rival desea atacar");
                                    try {
                                            System.out.println("\nDigite una opcion: ");
                                           escuadr = defop.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                     
                                    if (getJugador().getEntrenadas().size() > 0) {
                                        factory = Produccion.getFactory("Magos");
                                        Raza esc = factory.getMagos("EscuadronM");
                                        esc = getJugador().getEntrenadas().get(getJugador().getEntrenadas().size() - 1);
                                        esc.modificar_posicion(escuadr - 1);
                                        esc.modificar_lista(8);
                                        getJugador().getDefendiendo().add(esc);
                                        getOtro().getAtacando().get(escuadr - 1).modificar_vida(ataque1);
                                        /*if (getOtro().getAtacando().get(escuadr-1).vida() < 1) {
                                        System.out.println("Se destruyó la tropa enemiga");
                                        getOtro().getAtacando().remove(escuadr-1);
                                        System.out.println("Su tropa vuelve a estar a su disposición nuevamente");
                                    } else {
                                        System.out.println("Sigue con vida");
                                    }*/
                                    } else {
                                        System.out.println("No tienes tropas entrenadas");
                                    }

                                } else if (op41 == 2) {
                                    if (getJugador().getEntrenadas().size() > 0) {
                                        factory = Produccion.getFactory("Magos");
                                        Raza esc = factory.getMagos("EscuadronM");
                                        esc = getJugador().getEntrenadas().get(getJugador().getEntrenadas().size() - 1);
                                        esc.modificar_lista(9);
                                        getJugador().getDefendiendo().add(esc);
                                    } else {
                                        System.out.println("No tienes tropas entrenadas");
                                    }
                                }
                                break;
                            case 2:
                                if (getJugador().getUnicoM().get(0) != null) {
                                    Scanner defop1 = new Scanner(System.in);
                                    int op42=0;
                                    System.out.println("¿De qué se desea defender?");
                                    System.out.println("1. De un escuadron");
                                    System.out.println("2. De un Super soldado");
                                    try {
                                            System.out.println("\nDigite una opcion: ");
                                           op42 = defop1.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                    //System.out.println("Cual de los " + getOtro().getAtacando().size() + " escuadrones del rival desea atacar");
                                    
                                    if (op42 == 1) {
                                        int esc2=0;
                                        if (getOtro().getAtacando().size() > 0) {
                                            System.out.println("¿Cuál de los " + getOtro().getAtacando().size() + " escuadrones que lo están atacando?");
                                            try {
                                            System.out.println("\nDigite una opcion: ");
                                           esc2 = defop1.nextInt();
                                        } catch (Exception e) {
                                            System.err.println("\nNo ingresó un numero\n");
                                        }
                                            
                                            getJugador().getUnicoM().get(0).modificar_lista(8);
                                            getJugador().getUnicoM().get(0).modificar_posicion(esc2 - 1);
                                        } else {
                                            System.out.println("No te esta atacando con tropas el rival");
                                        }
                                    } else if (op42 == 2) {
                                        if (getOtro().getUnicoM().get(0) != null) {
                                            getJugador().getUnicoM().get(0).modificar_lista(9);
                                        } else {
                                            System.out.println("El rival no tiene un Super soldado atacando");
                                        }
                                    }
                                } else {
                                    System.out.println("No dispones de un Super Soldado para defender");
                                }
                                break;
                        }
                    } else {
                        System.out.println("No te está atacando el rival");
                    }

                    break;

                case 5:
                    if (getJugador().getMando().getGema() >= precio1 && getJugador().getMando().getElixir() >= precio2) {
                        factory = Produccion.getFactory("Magos");
                        Raza oro = factory.getMagos("Generador de Oro");
                        if (getJugador().getRaza() == 2) {
                            oro.vida_inicial();
                        } else {
                            System.out.println("");
                        }
                        getJugador().getRe1().add(oro);
                        System.out.println("Se construyó un generador de oro");
                        getJugador().getMando().setGema(getJugador().getMando().getGema() - precio1);
                        getJugador().getMando().setElixir(getJugador().getMando().getElixir() - precio2);
                    } else {
                        System.out.println("No dispone de recursos suficientes");
                    }
                    break;
                case 6:
                    if (getJugador().getMando().getOro() >= precio1 && getJugador().getMando().getGema() >= precio2) {
                        factory = Produccion.getFactory("Magos");
                        Raza elixir = factory.getMagos("Generador de Elixir");
                        if (getJugador().getRaza() == 2) {
                            elixir.vida_inicial();
                        } else {
                            System.out.println("");
                        }
                        getJugador().getRe2().add(elixir);
                        //generador_elixir.add(elixir);
                        System.out.println("Se construyó un generador de Elixir");
                        getJugador().getMando().setOro(getJugador().getMando().getOro() - precio1);
                        getJugador().getMando().setGema(getJugador().getMando().getGema() - precio2);
                    } else {
                        System.out.println("No dispone de recursos suficientes");
                    }
                    break;
                case 7:
                    if (getJugador().getMando().getElixir() >= precio1 && getJugador().getMando().getOro() >= precio2) {
                        factory = Produccion.getFactory("Magos");
                        Raza gema = factory.getMagos("Generador de Gema");
                        if (getJugador().getRaza() == 2) {
                            gema.vida_inicial();
                        } else {
                            System.out.println("");
                        }
                        getJugador().getRe3().add(gema);
                        //generador_gema.add(gema);
                        System.out.println("Se construyó un generador de gema");
                        getJugador().getMando().setElixir(getJugador().getMando().getElixir() - precio1);
                        getJugador().getMando().setOro(getJugador().getMando().getOro() - precio2);
                    } else {
                        System.out.println("No dispone de recursos suficientes");
                    }
                    break;
                case 8:
                    if (getJugador().getMando().getGema() >= precio1 && getJugador().getMando().getElixir() >= precio2) {
                        factory = Produccion.getFactory("Magos");
                        Raza entrena = factory.getMagos("Entrenador");
                        if (getJugador().getRaza() == 2) {
                            entrena.vida_inicial();
                        } else {
                            System.out.println("");
                        }
                        entrena.estado();
                        getJugador().getEntrenador().add(entrena);
                        //entrenar.add(entrena);
                        System.out.println("Se construyó una edificación para entrenar");
                        getJugador().getMando().setGema(getJugador().getMando().getGema() - precio1);
                        getJugador().getMando().setElixir(getJugador().getMando().getElixir() - precio2);
                    } else {
                        System.out.println("No dispone de recursos suficientes");
                    }

                    break;
                case 9:
                    if (getJugador().getMando().getOro() >= precio1 && getJugador().getMando().getGema() >= precio2) {
                        factory = Produccion.getFactory("Magos");
                        Raza veh1 = factory.getMagos("Alfombra");
                        if (getJugador().getRaza() == 2) {
                            veh1.vida_inicial();
                        } else {
                            System.out.println("");
                        }
                        getJugador().getVehiculo1().add(veh1);
                        //vehiculo1.add(veh1);
                        System.out.println("Se construyó un vehiculo tipo 1");
                        getJugador().getMando().setOro(getJugador().getMando().getOro() - precio1);
                        getJugador().getMando().setGema(getJugador().getMando().getGema() - precio2);
                    } else {
                        System.out.println("No dispone de recursos suficientes");
                    }
                    break;

                case 10:
                    if (getJugador().getMando().getElixir() >= precio1 && getJugador().getMando().getOro() >= precio2) {
                        factory = Produccion.getFactory("Magos");
                        Raza veh2 = factory.getMagos("Caballo");
                        if (getJugador().getRaza() == 2) {
                            veh2.vida_inicial();
                        } else {
                            System.out.println("");
                        }
                        getJugador().getVehiculo2().add(veh2);
                        //vehiculo2.add(veh2);
                        System.out.println("Se construyó un vehiculo tipo 2");
                        getJugador().getMando().setElixir(getJugador().getMando().getElixir() - precio1);
                        getJugador().getMando().setOro(getJugador().getMando().getOro() - precio2);
                    } else {
                        System.out.println("No dispone de recursos suficientes");
                    }
                    break;
                case 11:
                    int cap1 = getJugador().getMando().getCapacidad1();
                    int cap2 = getJugador().getMando().getCapacidad2();
                    int cap3 = getJugador().getMando().getCapacidad3();
                    double ca = cap1 + (cap1 * 0.10);
                    double ce = cap2 + (cap2 * 0.30);
                    double ci = cap3 + (cap3 * 0.50);
                    double sum = (ca + ce + ci);
                    sum = sum * 0.25;
                    sum = (int) sum / 3;

                   

                    if (getJugador().getMando().getOro() >= sum && getJugador().getMando().getElixir() >= sum && getJugador().getMando().getGema() >= sum) {
                        getJugador().getMando().level(ca, ce, ci);

                        int num1 = getJugador().getMando().getOro();
                        double res = num1 - sum;
                        getJugador().getMando().setOro((int) res);
                        int num2 = getJugador().getMando().getElixir();
                        double res2 = num2 - sum;
                        getJugador().getMando().setElixir((int) res2);
                        int num3 = getJugador().getMando().getGema();
                        double res3 = num3 - sum;
                        getJugador().getMando().setGema((int) res3);

                        System.out.println("El valor de almacenaje ahora de Oro es de " + getJugador().getMando().getCapacidad1());
                        System.out.println("El valor de almacenaje ahora de Elixir es de " + getJugador().getMando().getCapacidad2());
                        System.out.println("El valor de almacenaje ahora de Gema es de " + getJugador().getMando().getCapacidad3());
                    } else {
                        System.out.println("No dispone de suficientes recursos");
                    }
                    break;

                case 12:
                    int k = 0;
                    int sup = 1000;
                    boolean sta = false;
                    factory = Produccion.getFactory("Magos");
                    Raza entrenad = factory.getMagos("Entrenador");
                    //sta=getJugador().getEntrenador().get(k).question();
                    System.out.println(getJugador().getEntrenador().size() > 0);

                    if (getJugador().getEntrenador().size() > 0) {

                        while (k < getJugador().getEntrenador().size()) {
                            if (getJugador().getEntrenador().get(k).question() != true) {
                                k = k + 1;
                            } else {
                                sup = k;
                                k = getJugador().getEntrenador().size();
                            }

                        }

                        if (sup != 1000) {
                            int op=0;
                            Scanner leer2 = new Scanner(System.in);
                            System.out.println("¿Qué numero de tropa desea entrenar?");
                            System.out.println("1. Escuadron M");
                            System.out.println("2. Merlin");
                            
                            try {
                                System.out.println("\nDigite una opcion: ");
                                op = leer2.nextInt();
                            } catch (Exception e) {
                                System.err.println("\nNo ingresó un numero\n");
                            }

                            if (op == 1) {
                                factory = Produccion.getFactory("Magos");
                                Raza escua = factory.getMagos("EscuadronM");
                                escua.entrenar();
                                getJugador().getEntrenadas().add(escua);
                                getJugador().getEntrenador().get(sup).estado();
                                System.out.println("Se entrenó un EscuadonM");
                            } else if (op == 2) {
                                if (getJugador().getUnicoM().size()<1) {
                                    factory = Produccion.getFactory("Magos");
                                    Raza me = factory.getMagos("Merlin");
                                    getJugador().getUnicoM().add(me);
                                    System.out.println("Se entrenó a Merlin");
                                    getJugador().getEntrenador().get(sup).estado();
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

                    System.out.println("Tienes " + getJugador().getEntrenador().size() + " Para entrenar tropas");
                    System.out.println("Tienes " + getJugador().getVehiculo1().size() + " vehiculo tipo 1");
                    System.out.println("Tienes " + getJugador().getVehiculo2().size() + " vehiculo tipo 2 ");
                    //cont=cont+1;
                    //System.exit(0);
                    break;
                case 14:
                    System.exit(0);
                default:
                    System.out.println("");
            }
        } while (opc != 13);
    }
}
