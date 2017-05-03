/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Pila
 *              Implementacion de la Clase LinkedList
 *              Basado en el Ejemplo 17.9 del libro:
 *              Joyanes Aguilar, L., Zahonero Martínez, I., 2008.
 *              Estructuras de datos en Java. McGraw-Hill, Madrid, Spain.
 *
 * @param args
 * @author edzzn
 */
package IteradoresColeccion;

import java.util.*;

public class Pila {
    
	 private LinkedList<Character> pila;
	 public Pila()
	 {
		 pila = new LinkedList<Character> ();
	 }
	 public boolean pilaVacia()
	 {
		 return pila.isEmpty();
	 }
	 public void insertar(Character elemento)
	 {
		 pila.addFirst(elemento);
	 }
	 public Character quitar()throws Exception
	 {
		 return pila.removeFirst();
	 }
	 public void limpiarPila()
	 {
		 pila.clear();
	 }
	 public Character cimaPila() throws Exception
	 {
		 return pila.getFirst();
	 }
}
