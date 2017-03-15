/**
 * PRACTICA 5, EJERCICIO 5:
 * 
 * GUI sin inteligencia para el ejercicio 5.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio5;

import javax.swing.*;
import java.awt.*;
import java.text.*;

public class H2DGUI extends JFrame {
	public H2DGUI (){
		setLayout(new GridLayout(3, 1, 5, 20));
		add(new LogPanel());
		NumberFormat formater = NumberFormat.getNumberInstance(); 
		formater.setMaximumIntegerDigits(3);
		add(new JFormattedTextField(formater));
		add(new JButton("Convertir a decimal"));
		this.setSize(400,300);
		this.setResizable(false);
		this.setTitle("Hexadecimal to decimal");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class LogPanel extends JPanel {
	protected void paintComponent( Graphics g ) {
		super.paintComponent ( g ) ;
		g . drawString ( "Texto de ejemplo que será cambiado" , 0 , 40 ) ;
	}
}