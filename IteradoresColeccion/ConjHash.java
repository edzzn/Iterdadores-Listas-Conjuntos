/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Implementacion de la Clase HashSet
 *              Basado en el Ejemplo 17.10 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.util.*;

public class ConjHash {

    public static void main(String[] args) {
        ConjHash a;
        HashSet cn2, cn1;
        a = new ConjHash();
        cn2 = a.creaConj();
        System.out.println("Conjunto cn2: " + cn2);
        cn1 = a.creaConj();
        System.out.println("Conjunto cn1: " + cn1);

        // union de conjuntos
        HashSet union;
        union = (HashSet) cn2.clone();
        union.addAll(cn1);
        System.out.print("cn2 + cn1: ");
        a.iteraConj(union);
        
        // diferencia de conjuntos
        HashSet dif;
        dif = (HashSet) cn2.clone();
        dif.removeAll(cn1);
        System.out.print("cn2 - cn1: ");
        a.iteraConj(dif);
        
        // intersección de conjuntos
        HashSet inter;
        inter = (HashSet) cn2.clone();
        inter.retainAll(cn1);
        System.out.print("cn2 * cn1: ");
        a.iteraConj(inter);
    }

    public void iteraConj(Set cnj) {
        Iterator ic;
        Integer q;
        ic = cnj.iterator();
        while (ic.hasNext()) {

            q = (Integer) ic.next();

            System.out.print(q + " ");
        }
        System.out.println();
    }

    public HashSet creaConj() {
        HashSet q = new HashSet();
        int n = (int) (Math.random() * 7 + 3);
        for (int i = 0; i < n; i++) {

            boolean s;

            Integer e = (int) (Math.random() * 17 + 3);

            Integer r = new Integer(e);
            
            // devuelve true si r no esta en q
            s = q.add(r);
            
            // Si el elemeno ya se encontraba en q ( HashSet)
            if (!s) {
                System.out.println(e + " repetido");
            }
        }
        return q;
    }
}
