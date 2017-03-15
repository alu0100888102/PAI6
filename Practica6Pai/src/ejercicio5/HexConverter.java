/**
 * PRACTICA 5, EJERCICIO 4:
 * 
 * Disenar un programa en java que convierta números que el usuario introduce en línea de comandos en formato hexadecimal en numeros en formato decimal.
 * Implementar un método hex2Decimal(String hexString) y haga que este metodo lance una excepción NumberFormatException si la cadena no representa un numero hexadecimal. ´
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio5;

public class HexConverter {
	
	public static int hex2Dec(String hex){
		//manda el error
		if(hex.matches("^ [0-9A-F]+ $"))
			throw new NumberFormatException("Error, no es Hexadecimal");
		
		int result =0;
		int mult =0;
		for(int i =(hex.length()-1); i>=0; i--){
			if(mult != 0)
				mult *=16;
			else
				mult =1;
			if(hex.charAt(i) == 'A'){
				result += mult*10;
				continue;
			}
			if(hex.charAt(i) == 'B'){
				result += mult*11;
				continue;
			}
			if(hex.charAt(i) == 'C'){
				result += mult*12;
				continue;
			}
			if(hex.charAt(i) == 'D'){
				result += mult*13;
				continue;
			}
			if(hex.charAt(i) == 'E'){
				result += mult*14;
				continue;
			}
			if(hex.charAt(i) == 'F'){
				result += mult*15;
				continue;
			}
			
			if(hex.charAt(i) == '1'){
				result += mult*1;
				continue;
			}
			if(hex.charAt(i) == '2'){
				result += mult*2;
				continue;
			}
			if(hex.charAt(i) == '3'){
				result += mult*3;
				continue;
			}
			if(hex.charAt(i) == '4'){
				result += mult*4;
				continue;
			}
			if(hex.charAt(i) == '5'){
				result += mult*5;
				continue;
			}
			if(hex.charAt(i) == '6'){
				result += mult*6;
				continue;
			}
			if(hex.charAt(i) == '7'){
				result += mult*7;
				continue;
			}
			if(hex.charAt(i) == '8'){
				result += mult*1;
				continue;
			}
			if(hex.charAt(i) == '9'){
				result += mult*9;
				continue;
			}
			if(hex.charAt(i) == '0'){
				result += mult*0;
				continue;
			}
			
		}
		return result;
	}
	
	public static void main(String args[]){
		int r = HexConverter.hex2Dec(args[0]);
		System.out.println(r);
	}
}
