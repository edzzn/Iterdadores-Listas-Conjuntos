/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Implementacion de la Clase ListArray
 *              Basado en el Ejemplo 17.8 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.util.*;
import java.io.*;

public class ListaArray {

    public static void main(String args[]) {
        // Nos permite leeer la entra del teclado
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        // Inicializamos nuestro ArrayList
        List av = new ArrayList();
        String cd;
        System.out.println("Datos de entrada (adios para acabar)");

        try {
            do {
                cd = entrada.readLine();
                if (!cd.equalsIgnoreCase("adios")) {
                    av.add(cd);
                } else {
                    break;
                }
            } while (true);

            System.out.println("Lista completa: " + av);

            // elimina una palabra
            System.out.println("Palabra a eliminar: ");
            cd = entrada.readLine();
            if (av.remove(cd)) {
                System.out.println("Palabra borrada, lista actual:" + av);
            } else {
                System.out.println("No esta en la lista la palabra");
            }

            // reemplaza elemento que está en el centro
            av.set(av.size() / 2, "NuevaCadena");
            System.out.println("Lista completa:" + av);
            // busqueda de una palabra
            System.out.println("Búsqueda de una palabra: ");
            cd = entrada.readLine();
            int k = av.indexOf(cd);
            
            
            // crea iterador y recorre la lista hacia adelante
            if( k>= 0){
                System.out.println("Recorre la lista a partir de k: " + k);
                ListIterator ls = av.listIterator(k);
                
                while(ls.hasNext()){
                    System.out.print((String) ls.next() + " ");
                    
                }
            }

        } catch (Exception e) {}

    }

}
