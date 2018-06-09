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
public class GeneradorElixir implements Mago {
    public int Elixir;
    public int Vida=100;
    public boolean estado=false;       

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
    }
    

    public int getElixir() {
        return Elixir;
    }

    public void setElixir(int Elixir) {
        this.Elixir = Elixir;
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
        num=getElixir();
        setElixir(0);
        return num;
    }

    @Override
    public void generar() {
        setElixir(Elixir+50);
        
    }

    @Override
    public boolean entrenar() {
        return estado;
    }

    @Override
    public boolean estado() {
        if(estado==false){
            setEstado(true);
        }
        else{
            setEstado(false);
        }
        return estado;
    }

    @Override
    public void vida() {
    }
    
}
