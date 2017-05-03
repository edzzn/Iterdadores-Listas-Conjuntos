/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Implementacion de la Clase TreeSet
 *              Basado en el Ejemplo 17.11 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.util.*;

public class ConjOrdenado {

    public static void main(String[] args) {
        String[] cad1 = {"Libro", "Mesa", "mes", "Papel", "Papelera",
                         "armario", "globo"};
        String[] cad2 = {"lupi", "Maria", "angela", "Julian",
                          "Esperanza", "Miguel", "maite", "marta"};
        TreeSet cor1, cor2;
        cor1 = new TreeSet();
        cor2 = new TreeSet(new Compara());
        for (int i = 0; i < cad1.length; i++) {
            cor1.add(cad1[i]);
        }
        for (int i = 0; i < cad2.length; i++) {
            cor2.add(cad2[i]);
        }
        System.out.println("Conjunto ordenado, sin comparador: "
                + cor1);
        System.out.println("Conjunto ordenado, con comparador: "
                + cor2);

        // eliminar un elemento
        if (cor1.remove("Mes")) {
            System.out.println("Eliminado - Mes - de conjunto 1 "
                    + cor1);
        } else {
            System.out.println("No se encuentra - Mes - en conjunto 1 "
                    + cor1);
        }
        if (cor2.remove("MAITE")) {
            System.out.println("Eliminado - MAITE - de conjunto 2 "
                    + cor2);
        } else {
            System.out.println("No se encuentra - MAITE - en conjunto 2"+ cor2);
        }

        // Obtener un subconjunto y operaciones
        Set sc1;
        sc1 = cor1.subSet("Libro", "armario");
        System.out.println("Subconjunto : " + sc1);
        sc1.add("Marta");
        System.out.println("Subconjunto modificado: " + sc1);
        System.out.println("Conjunto origen modificado: " + cor1);
        cor1.add("lupi");
        cor1.add("Luna");
        System.out.println("Subconjunto modificado: " + sc1);
        System.out.println("Conjunto origen modificado: " + cor1);

        // Operaciones algebraicas: unión y diferencia
        TreeSet union = (TreeSet) cor2.clone();
        union.addAll(cor1);
        System.out.println("cor2 + cor1: " + union);
        TreeSet dif = (TreeSet) cor2.clone();
        dif.removeAll(cor1);
        System.out.println("cn2 - cn1: " + dif);
    }
}
