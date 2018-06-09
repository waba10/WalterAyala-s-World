/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;


import Magos.Mago;
import Mandos.CentroDeMando;
import RecursosMagos.GeneradorOro;
import java.util.ArrayList;

/**
 *
 * @author HP PC
 */
public class Jugador {
    /*public ArrayList<Integer> gen_oro;
    public ArrayList<Integer> gen_elixir;
    public ArrayList<Integer> gen_gema;
    public ArrayList<Integer> transporte1;
    public ArrayList<Integer> transporte2;
    */
    //public ArrayList<GeneradorOro> geno;
    public int num;
    public String raza;
    public CentroDeMando mando;
    public  ArrayList<Mago> re1;
    public  ArrayList<Mago> re2;
    public  ArrayList<Mago> re3;
    public  ArrayList<Mago> entrenador;
    public  ArrayList<Mago> vehiculo1;
    public  ArrayList<Mago> vehiculo2;
    public  ArrayList<Mago> entrenadas;
    
    
    
    
    
    public Jugador(){
    }

    public Jugador(int num, String raza, CentroDeMando mando, ArrayList<Mago> re1, ArrayList<Mago> re2, ArrayList<Mago> re3, ArrayList<Mago> entrenador, ArrayList<Mago> vehiculo1, ArrayList<Mago> vehiculo2,ArrayList<Mago> entrenadas) {
        this.num = num;
        this.raza = raza;
        this.mando = mando;
        this.re1 = re1;
        this.re2 = re2;
        this.re3 = re3;
        this.entrenador = entrenador;
        this.vehiculo1 = vehiculo1;
        this.vehiculo2 = vehiculo2;
      
        this.entrenadas=entrenadas;
    }

    
    public ArrayList<Mago> getRe1() {
        return re1;
    }

    public void setRe1(ArrayList<Mago> re1) {
        this.re1 = re1;
    }

    public ArrayList<Mago> getRe2() {
        return re2;
    }

    public void setRe2(ArrayList<Mago> re2) {
        this.re2 = re2;
    }

    public ArrayList<Mago> getRe3() {
        return re3;
    }

    public void setRe3(ArrayList<Mago> re3) {
        this.re3 = re3;
    }

    public ArrayList<Mago> getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(ArrayList<Mago> entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<Mago> getVehiculo1() {
        return vehiculo1;
    }

    public void setVehiculo1(ArrayList<Mago> vehiculo1) {
        this.vehiculo1 = vehiculo1;
    }

    public ArrayList<Mago> getVehiculo2() {
        return vehiculo2;
    }

    public void setVehiculo2(ArrayList<Mago> vehiculo2) {
        this.vehiculo2 = vehiculo2;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public CentroDeMando getMando() {
        return mando;
    }

    public void setMando(CentroDeMando mando) {
        this.mando = mando;
    }

    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<Mago> getEntrenadas() {
        return entrenadas;
    }

    public void setEntrenadas(ArrayList<Mago> entrenadas) {
        this.entrenadas = entrenadas;
    }
    
    
    public int fase(int cont){
        if(cont%2==0){
            System.out.println("Es turno del jugador "+ ((cont%2)+2));
        }
        else{
            System.out.println("Es turno del jugador "+ ((cont%2)));
        }
        
        cont=cont+1;
        return cont;
    }
    
    
    
}
