/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursosMagos;

import Magos.Mago;
import walterayala.s.world.AbstractFactory;
import walterayala.s.world.Produccion;

/**
 *
 * @author HP PC
 */
public class GeneradorOro implements Mago {
    public int Vida=100;
    public int Oro;
    

    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }
    

    public int getOro() {
        return Oro;
    }

    public void setOro(int Oro) {
        this.Oro = Oro;
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
    public void recolectar() {
    }

    @Override
    public void generar() {
           //setOro(Oro+200);
           System.out.println("Se construyó un generador de oro");
           setOro(Oro+50);
           System.out.println(Oro);
    }

    @Override
    public void entrenar() {
    }
    
}
