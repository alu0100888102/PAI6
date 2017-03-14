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
