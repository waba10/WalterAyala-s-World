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
public interface Mago { 
    
    void atacar();
    void defender();
    void construir();
    //Recolecta los recursos generados
    int recolectar();
    //Genera los recursos
    void generar();
    //Cambia de estado si se ha ocupado la edificación para entrenar
    boolean entrenar();
    //Cambia de estado dependiendo si esta listo para atacar
    boolean estado();
    //Retorna la vida
    int vida();
    //Retorna el estado
    boolean question();
    //Se asigna un nombre dependiendo el tipo de edificacion
    int nombre();
    //Se guarda la fase en la que fue creado el objeto
    int fase();
    //Modifica la vida
    int modificar_vida(int num);
    //Seleccionar la lista
    int lista();
    //Seleccionar posición
    int posicion();
    void modificar_lista(int num);
    void modificar_posicion(int num);
    
    
}
