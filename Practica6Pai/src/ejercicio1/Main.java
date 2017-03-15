/**
 * PRACTICA 5, EJERCICIO 1:
 * 
 * Disene un juego consistente en que el usuario adivine un número. El programa generará un número de 3 dígitos que el usuario tendra que adivinar.
 * El programa imprimirá en pantalla el número que había que adivinar, la respuesta del usuario y el premio obtenido.
 * El premio se concede de acuerdo a las siguientes reglas:
 * 1. Si el usuario acierta el numero, con los tres dígitos en orden, gana 10.000 €
 * 2. Si todos los dígitos del usuario coinciden con los dígitos del numero, gana 3.000 €
 * 3. Si un dígito de la respuesta coincide con algun dígito del numero, el premio son 1.000 €
 * 4. Si dos dígitos del usuario aparecen en el numero, el usuario gana 2.000 €
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio1;

public class Main {
	public static void main (String args[]){
		int number = Integer.parseInt(args[0]);
		Juego juego = new Juego();
		
		//Mensajes para los distintos casos
		switch(juego.testNumber(number)){
		case 0: System.out.println("Gana 0€");
		break;
		case 1: System.out.println("Gana 10.000€");
		break;
		case 2: System.out.println("Gana 3.000€");
		break;
		case 3: System.out.println("Gana 1.000€");
		break;
		case 4: System.out.println("Gana 2.000€");
		break;
		}
		System.out.println(juego.getNumero());
	}
}
