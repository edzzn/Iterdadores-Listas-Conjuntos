/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Implemntacion de la interfaz Enumeration, Iterador de Colección
 *              Basado en el Ejemplo 17.6 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.util.*;

public class EnumeradorPila {

    public static void main(String[] args) {
        final int N = 8;

        // instanciamos nuestra Pila
        Stack pila = new Stack();
        //Stack pila2 = new Stack();

        String[] palabra = {"José", "Juan", "Carlos", "Ricardo", "Alex"};

        // Insertamos los elementos a la Pila de manera aleatoria
        for (int i = 0; i < N; i++) {
            int n;
            n = (int) (Math.random() * N * 2);

            if (n < palabra.length) {
                pila.push(palabra[n]);
            } else if (n < N + 2) {
                pila.push(new Double(Math.pow(n, 2)));
            } else {
                pila.push(new Integer(n * 3));
            }

        } // Fin for

        // Pila Odenada
//        for (int i = 0; i < palabra.length; i++) {
//            pila2.push(palabra[i]);
//            pila2.push(new Integer(i));
//
//        }
        //Enumeration enumera = pila.elements();
//        Enumeration enumera = pila.elements();
        // Se crea el Enumerador de la pila
        Enumeration enumera = pila.elements();

        // Bucle para recorrer la pila
        System.out.println("Elementos de la pila, "
                + "en el orden establecido por el enumerador:");

        while (enumera.hasMoreElements()) {
            Object q;
            q = enumera.nextElement();
            System.out.print(q + " ");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Enumeration enumera2 = pila.elements();

        // Bucle para recorrer la pila
        System.out.println("Elementos de la pila, "
                + "en el orden establecido por el enumerador:");

        while (enumera2.hasMoreElements()) {
            Object q;
            q = enumera2.nextElement();
            System.out.print(q + " ");
        }
        System.out.println("");
        System.out.println("");

        // Bucle para recorrer la pila
        System.out.println("Elementos de la pila, en orden LIFO:");

        while (!pila.empty()) {
            Object q;
            q = pila.pop();
            System.out.print(q + " ");
        }
        System.out.println("");

    }

}
