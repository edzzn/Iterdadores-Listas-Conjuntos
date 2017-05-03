/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Implementacion de la Clase LinkedList
 *              Basado en el Ejemplo 17.9 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.io.*;

public class capicuaCola {

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String cd;
        try {
            do {
                System.out.println("Numero a probar si es capicua ");
                cd = entrada.readLine();
                if (!esCapicua(cd)) {
                    System.out.println(cd + " No es capicua");
                } else {
                    System.out.println(cd
                            + " es capicua, fin del programa");
                    break;
                }
            } while (true);
        } catch (Exception e) {;
        }
    }

    static boolean esCapicua(String nm) throws Exception {
        Cola q = new Cola();
        Pila pila = new Pila();
        for (int i = 0; i < nm.length(); i++) {
            q.insertar(new Character(nm.charAt(i)));
            pila.insertar(new Character(nm.charAt(i)));
        }
        boolean es = true;
        while (es && !q.colaVacia()) {
            Character c1, c2;
            c1 = q.quitar();
            c2 = pila.quitar();
            es = es && (c1.equals(c2));
        }
        return es;
    }
}
