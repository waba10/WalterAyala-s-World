/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursos;

import walterayala.s.world.AbstractFactory;
import walterayala.s.world.Produccion;
import Razas.Raza;

/**
 *
 * @author HP PC
 */
public class GeneradorOro implements Raza {
    public int vida=20;
    public int Oro;
    public boolean estado=false;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
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
    public int recolectar() {
        int num;
        num=getOro();
        setOro(0);
        return num;
        
    }

    @Override
    public void generar() {
           //setOro(Oro+200);
           if(getOro()<4000){
               setOro(Oro+400);
           }
           else{
               System.out.println("Llegaste al limite, si quieres seguir generando de este recurso, recolectalo");
           }
           
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
    public int vida() {
        return vida;
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

    @Override
    public int modificar_vida(int num) {
        setVida(vida-num);
        return vida;
    }

    @Override
    public int lista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int posicion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar_lista(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar_posicion(int num) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generar_doble() {
        setOro(Oro+800);
           }

    @Override
    public void vida_inicial() {
        setVida(getVida()*2);
    }
    
}
