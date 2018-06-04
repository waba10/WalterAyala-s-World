/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magos;

/**
 *
 * @author HP PC
 */
public class EscuadronM implements Mago{
    
    public int vida=0;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    @Override
    public void atacar() {
        System.out.println("30% de daño");
    }
    
    @Override
    public void defender() {
        System.out.println("20% de daño");
    }

    @Override
    public void construir() {
    }

    @Override
    public void recolectar() {
    }

    @Override
    public void generar() {
    }

    @Override
    public void entrenar() {
        System.out.println("Espere ## turnos para poder atacar");
    }
}
