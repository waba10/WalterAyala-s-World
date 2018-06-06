/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculoMagos;

import Magos.Mago;

/**
 *
 * @author HP PC
 */
public class Alfombra implements Mago {

    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void construir() {
        System.out.println("Se contruyó una edificación para alfombras");
    }

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
