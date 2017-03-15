/**
 * PRACTICA 5, EJERCICIO 3:
 * 
 * Escribir un programa que lea palabras de un fichero de texto y muestre por pantalla en orden alfabetico inverso todas las palabras que no estén duplicadas. 
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio3;

import java.io.*;

public class Main {
	public static void main (String args[]){
		File input = new File(args[0]);
		DetectorDuplicadas  detector = new DetectorDuplicadas(); 
		for(String p : detector.analyze(input))
			System.out.println(p);
	}
}
