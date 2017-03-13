package ejercicio1;

import java.util.*;

public class Juego {
	int unidades;
	int decenas;
	int centenas;
	
	public Juego(){
		this.nextNumber();
	}
	
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
	
	public int testNumber(int n){
		int nUnidades = (n%10);
		int nDecenas = (n%100 - n%10);
		int nCentenas = (n/100);
		
		boolean uc = false, dc = false, cc = false;
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
		
		if(uc && dc && cc)
			return 2;
		if(um || dm || cm)
			return 3;
		if((uc && dc) || (dc & cc) || (uc && cc))
			return 4;
		
		return 0;
	}
	
}
