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
public class Telefono {

    //Atributo,instanciar objeto
    public botonApagar EA = new botonApagar();
    Tecla[][] Teclado = new Tecla[5][3];

    public void setTeclado() {
        int n =0;
        String s;
        Tecla aux1 = new Tecla();
        Tecla aux2 = new Tecla();
        Tecla aux3 = new Tecla();
        Tecla aux4 = new Tecla();
        Tecla aux5 = new Tecla();
        Tecla aux6 = new Tecla();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tecla aux = new Tecla();
                n=n+1;
                s=Integer.toString(n);
                aux.setDigito(s.charAt(0));
                Teclado[i][j]=aux;
            }
            aux1.setDigito('*');
            Teclado[3][0] = aux1;
            aux2.setDigito('0');
            Teclado[3][1] = aux2;
            aux3.setDigito('#');
            Teclado[3][2] = aux3;
            aux4.setDigito('C');
            Teclado[4][0] = aux4;
            aux5.setDigito('M');
            Teclado[4][1] = aux5;
            aux6.setDigito('T');
            Teclado[4][2] = aux6;
        }
    }
}
