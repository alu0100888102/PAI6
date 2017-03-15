/**
 * PRACTICA 5, EJERCICIO 2:
 * 
 * Escribir un programa Syntax.java que convierta un fichero de entrada conteniendo codigo Java en un fichero HTML.
 * En el fichero HTML, las palabras reservadas de Java, los comentarios y las cadenas literales deberán mostrarse en negrita, verde y azul respectivamente.
 * 
 * Para hacerlo, emplearemos el analizador de texto desarrollado en la practica 4.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio2;

import Exports.*;
import java.io.*;

public class Java2Html extends ALexico {
	
	public void writeToHtml(File output){
		try{
			FileWriter writer = new FileWriter(output);
			int indentaciones =0;
			String nextline  = new String();
			for(int i =0; i < getTokensPrograma().size(); i++){
				//el corchete cerrado crea una nueva linea
				if(getTokensPrograma().get(i).getToken().matches("CBRACE")){
					nextline += getTokensPrograma().get(i).getText();
					writer.write(nextline+"\n");
					nextline = new String();
					indentaciones--;
					for(int j=0; j<indentaciones; j++)
						nextline += "   ";
				}	
				if(getTokensPrograma().get(i).getToken().startsWith("KW"))
					nextline += ("<b> "+getTokensPrograma().get(i).getText()+" </b>");
				else if(getTokensPrograma().get(i).getToken().matches("STRING"))
					nextline += ("<font color=\"blue\"> "+getTokensPrograma().get(i).getText()+" </font>");
				//el corchete abierto crea una nueva linea
				else if(getTokensPrograma().get(i).getToken().matches("OBRACE")){
					nextline += getTokensPrograma().get(i).getText()+" ";
					writer.write(nextline+"\n");
					nextline = new String();
					indentaciones++;
					for(int j=0; j<indentaciones; j++)
						nextline += "   ";
				}
				//el punto y coma crea una nueva linea
				else if(getTokensPrograma().get(i).getToken().matches("SEMICOLON")){
					nextline += getTokensPrograma().get(i).getText()+" ";
					writer.write(nextline+"\n");
					nextline = new String();
					for(int j=0; j<indentaciones; j++)
						nextline += "   ";
				}
				else
					nextline += getTokensPrograma().get(i).getText()+" ";
			}
			writer.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Error en el fichero: no se encuentra " + e);
			System.exit(1);
		}
		catch(IOException e){
			System.out.println("Error en el fichero: error de entrada/salida " + e);
			System.exit(1);
		}
	}
}
