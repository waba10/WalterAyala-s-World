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
    public boolean estado=false;
    public int vida=0;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
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
    public int vida() {
        return vida;
    }

    @Override
    public boolean entrenar() {
    if(estado==false){
            setEstado(true);
        }
        else{
            setEstado(false);
        }
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
    public boolean question() {
        return estado;
    }

    @Override
    public int nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int fase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
