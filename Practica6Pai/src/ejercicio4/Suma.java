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
			line = line.substring(0, line.length()-1); 
		}
		int n1 = Integer.parseInt(line);
		
		System.out.println("Introduzca otro numero para sumar");
		reader = new Scanner(System.in);  // Reading from System.in
		line = reader.nextLine();
		while(!line.matches("\\d+")){
			System.out.println("Error en el numero, por favor vuelva a intentarlo");
			reader = new Scanner(System.in);  // Reading from System.in
			line = reader.nextLine();
			line = line.substring(0, line.length()-1); 
		}
		reader.close();
		int n2 = Integer.parseInt(line);
		System.out.println("La suma es: " + (n1+n2));
	}
}
