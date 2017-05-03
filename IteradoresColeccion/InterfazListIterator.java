/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Punto, Utilizada en IteradorPila,
 *              Basado en el Ejemplo 17.7 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.util.*;

public class InterfazListIterator {

    public static void main(String args[]) {

        // creamos una lista 
        LinkedList ld = new LinkedList();
        ListIterator iterBdir;

        ld.add("Primero");
        ld.add("Segundo");
        ld.add("Tercero");
        ld.add("Cuarto");
        ld.add("Quinto");
        ld.add("Sexto");

        String elemento;

        // El elemento actual es el Primero
        iterBdir = ld.listIterator();

        elemento = (String) iterBdir.next();
        System.out.println(elemento);

        // El elemento actual es el Cuarto
        iterBdir = ld.listIterator(4);

        elemento = (String) iterBdir.next();
        System.out.println(elemento);

    }

}
