/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.relacioncomposicion;

import java.util.Scanner;

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
        System.out.println("El starTac está " + starTac.EA.IO);
        starTac.EA.presionar();
        System.out.println("El starTac está " + starTac.EA.IO);
        starTac.setTeclado();
        System.out.println("Los digitos son: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(starTac.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }
        int i = 0;
        Scanner s = new Scanner(System.in);
        int r = 1;
        while (r == 1) {
            Contacto.guardarContactos(Telefono.Contactos, i);
            i++;
            System.out.println("Agregar contacto(Teclee 1 para si/ 2 para no): ");
            r = s.nextInt();
            if (!(i < 100)) {
                r = 2;
            }
        }
        System.out.println("Mostrar contactos: ");
        Contacto.mostrarContactos(Telefono.Contactos, i);

        System.out.println("Mostrar contactos por índice");
        System.out.print("¿Cuál posición quieres consultar: ");
        int p = s.nextInt();
        if (p < Telefono.Contactos.length) {
            if (p < i) {
                Contacto.mostrarContactosIndice(Telefono.Contactos, p);
            } else {
                System.out.println("Sólo hay " + i + " contactos registrados");
            }

        } else {
            System.out.println("el valor solicitado no existe o está fuera de los límites del número de contactos agregados");
        }

    }
}
