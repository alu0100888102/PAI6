package ejercicio1;

public class Main {
	public static void main (String args[]){
		int number = Integer.parseInt(args[0]);
		Juego juego = new Juego();
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
		System.out.println(juego.getNumero()+"");
	}
}
