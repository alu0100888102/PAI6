/**
 * PRACTICA 5, EJERCICIO 4:
 * 
 * GUI sin inteligencia para el ejercicio 4.
 * 
 * @author alu0100888102
 * @version 1.0
 * �ngel Hamilton Lopez
 * alu0100888102@ull.es
 */


package ejercicio4;

import javax.swing.*;
import java.awt.*;
import java.text.*;

public class SumaGUI extends JFrame {
	public SumaGUI (){
		setLayout(new GridLayout(2, 1, 5, 20));
		add(new LogPanel());
		add(new JTextField());
		this.setSize(400,300);
		this.setResizable(false);
		this.setTitle("Suma dos numeros");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class LogPanel extends JPanel {
	protected void paintComponent( Graphics g ) {
		super.paintComponent ( g ) ;
		g.drawString ( "Aki ban las sumas" , 0 , 40 ) ;
	}
}