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
public class CentroDeMando implements Mando {
     public int vida;
     public int oro;
     public int elixir;
     public int gema;

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
    
     @Override
    public void level() {
        System.out.println("30% Daño");
    }
}
