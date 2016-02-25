/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.relacioncomposicion;

/**
 *
 * @author JESUS PARGA VELA
 */
public class botonApagar {
    //Atributos
    public boolean IO;
    
    //Constructor
    public botonApagar(){
        this.IO= false;
    }
    
    //Métodos
    public void presionar(){
         this.IO=!this.IO; 
    }
}

