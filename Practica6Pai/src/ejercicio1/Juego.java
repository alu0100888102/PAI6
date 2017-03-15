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

import java.util.*;

public class Juego {
	int unidades;
	int decenas;
	int centenas;
	
	public Juego(){
		this.nextNumber();
	}
	
	//Setters y getters
	public int getUnidades(){
		return unidades;
	}
	public void setUnidades(int n){
		unidades = n;
	}
	public int getDecenas(){
		return decenas;
	}
	public void setDecenas(int n){
		decenas = n;
	}
	public int getCentenas(){
		return centenas;
	}
	public void setCentenas(int n){
		centenas = n;
	}
	public int getNumero(){
		return (unidades + decenas*10 + centenas*100);
	}
	public void setNumero(int n){
		unidades = (n%10);
		decenas = (n%100 - n%10);
		centenas = (n/100);
	}
	
	public void nextNumber(){
		Random rand = new Random();
		setNumero(rand.nextInt(100));
	}
	
	 /**
	  * Metodo que comprueba si el numero es igual. Devuelve el número del caso descrito en el encabezado, o 0 si falla completamente.
	  * @param n
	  * @return
	  */
	public int testNumber(int n){
		int nUnidades = (n%10);
		int nDecenas = (n%100 - n%10);
		int nCentenas = (n/100);
		
		//Indican si las unidades, decenas o centenas coinciden con algun dígito del numero a adivinar
		boolean uc = false, dc = false, cc = false;
		//Indican si las unidades, decenas o centenas coinciden en valor y posicion con el número a adivinar
		boolean um = false, dm = false, cm = false;
		
		if(nUnidades == unidades){
			um = true;
			uc = true;
		}
		if(nDecenas == decenas){
			dm = true;
			dc = true;
		}
		if(nCentenas == centenas){
			cm = true;
			cc = true;
		}
		
		//caso 1, acierta todo
		if(cm && dm && um)
			return 1;
		
		if(nUnidades == decenas && !dc && !um)
			dc = true;
		else if(nUnidades == centenas && !cc && !um)
			cc = true;
		
		if(nDecenas == unidades && !uc && !dm)
			uc = true;
		else if(nDecenas == centenas && !cc && !dm)
			cc = true;
		
		if(nCentenas == unidades && !uc && !cm)
			uc = true;
		else if(nCentenas == decenas && !cc && !cm)
			cc = true;
		
		//caso 2, acierta todos los valores pero no las posiciones
		if(uc && dc && cc)
			return 2;
		//caso 3, acierta algun valor con su posicion
		if(um || dm || cm)
			return 3;
		//caso 4, acierta dos de los valores
		if((uc && dc) || (dc & cc) || (uc && cc))
			return 4;
		//en otro caso
		return 0;
	}
	
}
