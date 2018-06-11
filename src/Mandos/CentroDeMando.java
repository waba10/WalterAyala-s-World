/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mandos;

/**
 *
 * @author HP PC
 */
public class CentroDeMando {
     public int vida=10;
     public int oro=200;
     public int elixir=200;
     public int gema=200;
     public int capacidad1=10000;
     public int capacidad2=5000;
     public int capacidad3=3000;
     int capacidad111=12100;
     int capacidad222=8450;
     int capacidad333=6750;

    public int getCapacidad1() {
        return capacidad1;
    }

    public void setCapacidad1(int capacidad1) {
        this.capacidad1 = capacidad1;
    }

    public int getCapacidad2() {
        return capacidad2;
    }

    public void setCapacidad2(int capacidad2) {
        this.capacidad2 = capacidad2;
    }

    public int getCapacidad3() {
        return capacidad3;
    }

    public void setCapacidad3(int capacidad3) {
        this.capacidad3 = capacidad3;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
     public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }
    
     public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }
     public int getGema() {
        return gema;
    }

    public void setGema(int gema) {
        this.gema = gema;
    }
    
    
    public void level(double ca, double ce, double ci) {
        setCapacidad1((int)ca);
        setCapacidad2((int)ce);
        setCapacidad3((int)ci);
    }
}
