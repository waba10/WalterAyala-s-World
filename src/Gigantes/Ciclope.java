/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gigantes;

/**
 *
 * @author HP PC
 */
public class Ciclope implements Gigante {
     @Override
    public void atacar() {
        System.out.println("30% Daño");
    }
    
    @Override
    public void defender() {
        System.out.println("20% de daño");
    }
}
