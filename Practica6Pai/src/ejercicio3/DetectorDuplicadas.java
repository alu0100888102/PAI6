package ejercicio3;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.*;

public class DetectorDuplicadas {
	Hashtable<String, Boolean> tablaRepeticiones;
	ArrayList<String> palabras;
	
	public DetectorDuplicadas(){
		tablaRepeticiones = new Hashtable<String, Boolean>();
		palabras = new ArrayList<String>();
	}
	
	public ArrayList<String> analyze(File input){
		ArrayList<String> output = new ArrayList<String>();
		try{
			FileInputStream istream = new FileInputStream(input);
			 
			//Construct BufferedReader from InputStreamReader
			BufferedReader bufferreader = new BufferedReader(new InputStreamReader(istream));
		 
			String line = null;
			//Comment indica si es un comentario.
			AtomicBoolean comment = new AtomicBoolean(false);
			while ((line = bufferreader.readLine()) != null) {
				if(line.isEmpty())
					continue;
				String[] division = line.split("\\s+");
				for(String p : division){
					if(tablaRepeticiones.containsKey(p))
						tablaRepeticiones.put(p, true);
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
		Collections.sort(palabras);
		
		for(int i = palabras.size()-1; i>=0; i++){
			if(!tablaRepeticiones.containsKey(palabras.get(i)))
				output.add(palabras.get(i));
		}
		return output;
	}
}
