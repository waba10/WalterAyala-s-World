/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walterayala.s.world;


import Mandos.CentroDeMando;
import RecursosMagos.GeneradorOro;
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
    public ArrayList<GeneradorOro> geno;
    public int num;
    public String raza;
    public CentroDeMando mando;
    
    
    
    public Jugador(){
    }

    public Jugador(ArrayList<GeneradorOro> geno, int num, String raza, CentroDeMando mando) {
        this.geno = geno;
        this.num = num;
        this.raza = raza;
        this.mando = mando;
    }

    

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    
    
    

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public int fase(int cont){
        if(cont%2==0){
            System.out.println("Es turno del jugador "+ ((cont%2)+2));
        }
        else{
            System.out.println("Es turno del jugador "+ ((cont%2)));
        }
        
        cont=cont+1;
        return cont;
    }
    
    
    
}
