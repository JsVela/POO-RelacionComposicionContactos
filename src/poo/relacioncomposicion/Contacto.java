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
public class Contacto {

    //Atributos
    private String nombre;
    private String telefono;
    private String correo;

    //Constructor
    public Contacto(String nombre, String telefono, String correo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Contacto() {

    }

    //Métodos
    public static void guardarContactos(Contacto[] Contactos, int i) {
        Scanner s = new Scanner(System.in);
        String nom, tel, correo;
        System.out.println("Proporciona el nombre: ");
        nom = s.next();
        System.out.println("Proporcoina el tel: ");
        tel = s.next();
        System.out.println("Proporciona el correo: ");
        correo = s.next();
        Contactos[i] = new Contacto(nom, tel, correo);
    }

    public static void mostrarContactos(Contacto[] Contactos, int j) {
        for (int i = 0; i < j; i++) {
            System.out.println(Contactos[i].nombre + " " + Contactos[i].telefono + " " + Contactos[i].correo);
        }
    }

    public static void mostrarContactosIndice(Contacto[] Contactos, int i) {

        System.out.println(Contactos[i].nombre + " " + Contactos[i].telefono + " " + Contactos[i].correo);

    }
}
