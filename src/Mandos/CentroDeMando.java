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
     public int vida=0;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
     @Override
    public void level() {
        System.out.println("30% Daño");
    }
}
