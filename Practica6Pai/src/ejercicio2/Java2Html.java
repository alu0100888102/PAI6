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
				if(getTokensPrograma().get(i).getToken().matches("CBRACE")){
					nextline += getTokensPrograma().get(i).getText();
					writer.write(nextline);
					nextline += new String();
					indentaciones--;
				}
				for(int j=0; j<indentaciones; j++)
					nextline += "   ";
				if(getTokensPrograma().get(i).getToken().matches("^ KW.* $"))
					nextline += ("<b>"+getTokensPrograma().get(i).getText()+"</b>");
				else if(getTokensPrograma().get(i).getToken().matches("STRING"))
					nextline += ("<font color=\"blue\">"+getTokensPrograma().get(i).getText()+"</font>");
				else if(getTokensPrograma().get(i).getToken().matches("OBRACE")){
					nextline += getTokensPrograma().get(i).getText();
					writer.write(nextline);
					nextline += new String();
					indentaciones++;
				}
				else if(getTokensPrograma().get(i).getToken().matches("SEMICOLON")){
					nextline += getTokensPrograma().get(i).getText();
					writer.write(nextline);
					nextline += new String();
				}
				else
					nextline += getTokensPrograma().get(i).getText();
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
