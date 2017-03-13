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
