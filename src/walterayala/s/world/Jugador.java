/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;


import Mandos.CentroDeMando;
import Recursos.GeneradorOro;
import java.util.ArrayList;
import Razas.Raza;

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
    public int raza;
    public CentroDeMando mando;
    public  ArrayList<Raza> re1;
    public  ArrayList<Raza> re2;
    public  ArrayList<Raza> re3;
    public  ArrayList<Raza> entrenador;
    public  ArrayList<Raza> vehiculo1;
    public  ArrayList<Raza> vehiculo2;
    public  ArrayList<Raza> entrenadas;
    public  ArrayList<Raza> atacando;
    public  ArrayList<Raza> defendiendo;
    public ArrayList<Raza> unicoM;
 
    public Jugador(){
    }

    public Jugador(int num, int raza, CentroDeMando mando, ArrayList<Raza> re1, ArrayList<Raza> re2, ArrayList<Raza> re3, ArrayList<Raza> entrenador, ArrayList<Raza> vehiculo1, ArrayList<Raza> vehiculo2, ArrayList<Raza> entrenadas, ArrayList<Raza> atacando, ArrayList<Raza> defendiendo, ArrayList<Raza> unicoM) {
        this.num = num;
        this.raza = raza;
        this.mando = mando;
        this.re1 = re1;
        this.re2 = re2;
        this.re3 = re3;
        this.entrenador = entrenador;
        this.vehiculo1 = vehiculo1;
        this.vehiculo2 = vehiculo2;
        this.entrenadas = entrenadas;
        this.atacando = atacando;
        this.defendiendo = defendiendo;
        this.unicoM = unicoM;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public ArrayList<Raza> getUnicoM() {
        return unicoM;
    }

    public void setUnicoM(ArrayList<Raza> unicoM) {
        this.unicoM = unicoM;
    }


    public ArrayList<Raza> getDefendiendo() {
        return defendiendo;
    }

    public void setDefendiendo(ArrayList<Raza> defendiendo) {
        this.defendiendo = defendiendo;
    }
    
    public ArrayList<Raza> getAtacando() {
        return atacando;
    }

    public void setAtacando(ArrayList<Raza> atacando) {
        this.atacando = atacando;
    }

    
    public ArrayList<Raza> getRe1() {
        return re1;
    }

    public void setRe1(ArrayList<Raza> re1) {
        this.re1 = re1;
    }

    public ArrayList<Raza> getRe2() {
        return re2;
    }

    public void setRe2(ArrayList<Raza> re2) {
        this.re2 = re2;
    }

    public ArrayList<Raza> getRe3() {
        return re3;
    }

    public void setRe3(ArrayList<Raza> re3) {
        this.re3 = re3;
    }

    public ArrayList<Raza> getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(ArrayList<Raza> entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<Raza> getVehiculo1() {
        return vehiculo1;
    }

    public void setVehiculo1(ArrayList<Raza> vehiculo1) {
        this.vehiculo1 = vehiculo1;
    }

    public ArrayList<Raza> getVehiculo2() {
        return vehiculo2;
    }

    public void setVehiculo2(ArrayList<Raza> vehiculo2) {
        this.vehiculo2 = vehiculo2;
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

    public ArrayList<Raza> getEntrenadas() {
        return entrenadas;
    }

    public void setEntrenadas(ArrayList<Raza> entrenadas) {
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
