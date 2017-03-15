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

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.*;

public class DetectorDuplicadas {
	//guarda la palabra y si esta o no duplicada
	Hashtable<String, Boolean> tablaRepeticiones;
	//guarda las palabras
	ArrayList<String> palabras;
	
	public DetectorDuplicadas(){
		tablaRepeticiones = new Hashtable<String, Boolean>();
		palabras = new ArrayList<String>();
	}
	
	/**
	 * Devuelve un array con las palabras no duplicadas ordenadas
	 * @param input
	 * @return
	 */
	public ArrayList<String> analyze(File input){
		ArrayList<String> output = new ArrayList<String>();
		try{
			FileInputStream istream = new FileInputStream(input);
			 
			//Construct BufferedReader from InputStreamReader
			BufferedReader bufferreader = new BufferedReader(new InputStreamReader(istream));
		 
			String line = null;
			while ((line = bufferreader.readLine()) != null) {
				if(line.isEmpty())
					continue;
				//divide la linea en palabras por los espacios
				String[] division = line.split("\\s+");
				for(String p : division){
					// si ya la contiene, pues entonces se repite
					if(tablaRepeticiones.containsKey(p))
						tablaRepeticiones.put(p, true);
					//si no entonces la añadimos con "false" indicando que no se repite
					else{
						tablaRepeticiones.put(p, false);
						palabras.add(p);
					}
				}
			}
			bufferreader.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Error en el fichero: no se encuentra " + e);
			System.exit(1);
		}
		catch(IOException e){
			System.out.println("Error en el fichero: error de entrada/salida " + e);
			System.exit(1);
		}
		catch(IllegalArgumentException e){
			System.out.println(" Error en el fichero: error de entrada/salida " + e);
			System.exit(1);
		}
		//ordena las palabras y las coje por orden alfabetico inverso
		Collections.sort(palabras);
		
		for(int i = palabras.size()-1; i>=0; i++){
			if(!tablaRepeticiones.containsKey(palabras.get(i)))
				output.add(palabras.get(i));
		}
		return output;
	}
}
