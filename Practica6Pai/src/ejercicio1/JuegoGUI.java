/**
 * PRACTICA 5, EJERCICIO 1:
 * 
 * GUI sin inteligencia para el Juego de Adivina un n�mero.
 * 
 * @author alu0100888102
 * @version 1.0
 * �ngel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.text.*;

public class JuegoGUI extends JFrame {
	public JuegoGUI (){
		setLayout(new GridLayout(3, 1, 5, 20));
		add(new LogPanel());
		NumberFormat formater = NumberFormat.getNumberInstance(); 
		formater.setMaximumIntegerDigits(3);
		add(new JFormattedTextField(formater));
		add(new JButton("Comprobar respuesta"));
		this.setSize(400,300);
		this.setResizable(false);
		this.setTitle("Adivina el N�mero");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class LogPanel extends JPanel {
	protected void paintComponent( Graphics g ) {
		super.paintComponent ( g ) ;
		g . drawString ( "Texto de ejemplo que ser� cambiado" , 0 , 40 ) ;
	}
}