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
public class GeneradorGema implements Mago {
    public int Vida=100;
    public int Gema;

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }
    

    public int getGema() {
        return Gema;
    }

    public void setGema(int Gema) {
        this.Gema = Gema;
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
        int num;
        num=getGema();
        setGema(0);
        return num;
    }

    @Override
    public void generar() {
        setGema(Gema+50);
    }

    @Override
    public void entrenar() {
    }
    
}
