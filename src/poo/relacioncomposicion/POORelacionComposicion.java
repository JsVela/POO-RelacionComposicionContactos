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
public class POORelacionComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char resultado;
        Telefono starTac = new Telefono();
        starTac.EA.presionar();
        System.out.println("El starTac está" + starTac.EA.IO);
        starTac.EA.presionar();
        System.out.println("El starTac está" + starTac.EA.IO);
        starTac.setTeclado();
        System.out.println("Los digitos son: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(starTac.Teclado[i][j].getDigito()+ " ");
            }
            System.out.println("");
        }
    }

}
