/**
 * PRACTICA 5, EJERCICIO 1:
 * 
 * Disene un juego consistente en que el usuario adivine un n�mero. El programa generar� un n�mero de 3 d�gitos que el usuario tendra que adivinar.
 * El programa imprimir� en pantalla el n�mero que hab�a que adivinar, la respuesta del usuario y el premio obtenido.
 * El premio se concede de acuerdo a las siguientes reglas:
 * 1. Si el usuario acierta el numero, con los tres d�gitos en orden, gana 10.000 �
 * 2. Si todos los d�gitos del usuario coinciden con los d�gitos del numero, gana 3.000 �
 * 3. Si un d�gito de la respuesta coincide con algun d�gito del numero, el premio son 1.000 �
 * 4. Si dos d�gitos del usuario aparecen en el numero, el usuario gana 2.000 �
 * 
 * @author alu0100888102
 * @version 1.0
 * �ngel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio1;

public class Main {
	public static void main (String args[]){
		int number = Integer.parseInt(args[0]);
		Juego juego = new Juego();
		
		//Mensajes para los distintos casos
		switch(juego.testNumber(number)){
		case 0: System.out.println("Gana 0�");
		break;
		case 1: System.out.println("Gana 10.000�");
		break;
		case 2: System.out.println("Gana 3.000�");
		break;
		case 3: System.out.println("Gana 1.000�");
		break;
		case 4: System.out.println("Gana 2.000�");
		break;
		}
		System.out.println(juego.getNumero());
	}
}
