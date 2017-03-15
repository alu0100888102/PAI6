/**
 * PRACTICA 5, EJERCICIO 3:
 * 
 * Escribir un programa que solicite al usuario dos numeros enteros y muestre su suma por pantalla.
 * El programa deberá solicitar al usuario que vuelva a introducir los numeros si la entrada es incorrecta.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio4;

import java.util.*;

public class Suma {
	public static void main (String args[]){
		System.out.println("Introduzca un numero para sumar");
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		String line = reader.nextLine();
		while(!line.matches("\\d+")){
			System.out.println("Error en el numero, por favor vuelva a intentarlo");
			reader = new Scanner(System.in);  // Reading from System.in
			line = reader.nextLine();
		}
		int n1 = Integer.parseInt(line);
		
		System.out.println("Introduzca otro numero para sumar");
		Scanner reader2 = new Scanner(System.in);  // Reading from System.in
		line = reader2.nextLine();
		while(!line.matches("\\d+")){
			System.out.println("Error en el numero, por favor vuelva a intentarlo");
			reader2 = new Scanner(System.in);  // Reading from System.in
			line = reader2.nextLine();
		}
		reader2.close();
		reader.close();
		int n2 = Integer.parseInt(line);
		System.out.println("La suma es: " + (n1+n2));
	}
}
