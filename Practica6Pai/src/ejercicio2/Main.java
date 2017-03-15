/**
 * PRACTICA 5, EJERCICIO 2:
 * 
 * Escribir un programa Syntax.java que convierta un fichero de entrada conteniendo codigo Java en un fichero HTML.
 * En el fichero HTML, las palabras reservadas de Java, los comentarios y las cadenas literales deberán mostrarse en negrita, verde y azul respectivamente.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio2;

import java.io.File;

public class Main {
	public static void main(String args[]){
		File input = new File(args[0]);
		File output = new File(args[1]);
		Java2Html analizador = new Java2Html();
		analizador.analize(input);
		analizador.writeToHtml(output);
	}
}
