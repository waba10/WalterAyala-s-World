/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursosMagos;

import Magos.Mago;


/**
 *
 * @author HP PC
 */
public class RecolectorOro implements Mago{
    GeneradorOro recolect= new GeneradorOro();
    public int Vida=80;

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }
    
    @Override
    public void atacar() {
    }

    @Override
    public void defender() {
    }

    @Override
    public void construir() {
    }

    @Override
    public int recolectar() {
        
       
        System.out.println("Se ha recolectado ## Oro");  
        return 0;
        
    }

    @Override
    public void generar() {
    }

    @Override
    public void entrenar() {
    }
    
}
