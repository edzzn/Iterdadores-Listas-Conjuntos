/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Implemntacion de la interfaz Iterator, Iterador de Colección
 *              Basado en el Ejemplo 17.7 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.util.*;

public class InterfazIterador {

    public static void main(String args[]) {

        List lista = new ArrayList();
        Iterator iter;

        // Se llena la lista de objetos Punto
        lista.add(new Punto(0));
        lista.add(new Punto(1));
        lista.add(new Punto(2));
        lista.add(new Punto(3));
        lista.add(new Punto(4));
        lista.add(new Punto(5));
        lista.add(new Punto(6));
        lista.add(new Punto(7));
        lista.add(new Punto(8));
        lista.add(new Punto(9));
        lista.add(new Punto(10));
        lista.add(new Punto(11));
        lista.add(new Punto(12));
        lista.add(new Punto(13));
        lista.add(new Punto(14));

        
        iter = lista.iterator();

        while (iter.hasNext()) {
            Punto q;
            q = (Punto) iter.next();
            if (q.getX() < 2 || q.getX() > 12) {
                System.out.println("Punto: " + q.getX() + " se elimina");
                iter.remove();
            }

        }

    }
}
