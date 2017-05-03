/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase compara
 *              Implementacion de la Clase TreeSet
 *              Basado en el Ejemplo 17.11 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.util.*;

class Compara implements Comparator {

    @Override
    public int compare(Object x1, Object x2) {
        String c1 = (String) x1;
        String c2 = (String) x2;
        c1 = c1.toUpperCase();
        c2 = c2.toUpperCase();
        return c1.compareTo(c2);
    }
}
