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
public class EntrenadorMago implements Mago {

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void construir() {
        System.out.println("Se ha construido una edificacion de Entrenamiento de Magos");}

    @Override
    public int recolectar() {
        return 0;
    }

    @Override
    public void generar() {
    }

    @Override
    public void entrenar() {
    }
    
}
