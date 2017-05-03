/**
 * AUTOR: 	Edisson Reinozo
 * CREACION:	1 Mayo 2017
 * MODIFICACION:
 * DESCRIPCION: Clase Cola
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

public class Cola {
   
	 private LinkedList<Character> qq;

	 public Cola ()
	 {
		 qq = new LinkedList<Character> ();
	 }
	 public boolean colaVacia()
	 {
		 return qq.isEmpty();
	 }
	 public void insertar(Character elemento)
	 {
		 qq.addLast(elemento);
	 }
	 public Character quitar() throws Exception
	 {
		 return qq.removeFirst();
	 }
	 public void borrarCola()
	 {
		 qq.clear();
	 }
	 public Character frenteCola() throws Exception
	 {
		 return qq.getFirst();
	 }
}
