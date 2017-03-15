/**
 * PRACTICA 5, EJERCICIO 3:
 * 
 * GUI sin inteligencia para el ejercicio 3.
 * 
 * @author alu0100888102
 * @version 1.0
 * Ángel Hamilton Lopez
 * alu0100888102@ull.es
 */

package ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.text.*;

public class DetectorGUI extends JFrame {
	public DetectorGUI(){
		this.add(new LogPanel());
		this.setSize(400,300);
		this.setResizable(false);
		this.setTitle("Detector de duplicadas");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
class LogPanel extends JPanel {
	protected void paintComponent( Graphics g ) {
		super.paintComponent ( g ) ;
		g.setColor(Color.BLUE);
		g.drawString ( "Aqui es donde iran las palabras cuando las tenga." , 0 , 40 ) ;
	}
}