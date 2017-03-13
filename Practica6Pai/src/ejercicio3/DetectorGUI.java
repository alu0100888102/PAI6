package ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.text.*;

public class DetectorGUI extends JFrame {
	public DetectorGUI(){
		this.add(new LogPanel());
		this.setSize(400,300);
		this.setResizable(false);
		this.setTitle("Adivina el Número");
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