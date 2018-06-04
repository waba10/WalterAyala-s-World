/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;

import java.util.ArrayList;

/**
 *
 * @author HP PC
 */
public class Jugador {
    /*public ArrayList<Integer> gen_oro;
    public ArrayList<Integer> gen_elixir;
    public ArrayList<Integer> gen_gema;
    public ArrayList<Integer> transporte1;
    public ArrayList<Integer> transporte2;
    */
    public int num;
    
    public Jugador(){
    }

    public Jugador(int num) {
        this.num = num;
    }
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int fase(int cont){
        System.out.println("Es turno del jugador "+ (cont%2));
        cont=cont+1;
        return cont;
    }
    
    
    
}
