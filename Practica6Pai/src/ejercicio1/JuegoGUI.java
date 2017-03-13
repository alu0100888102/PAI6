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
		add(new JButton("¡Otra vez!"));
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
		g . drawString ( "Texto de ejemplo que será cambiado" , 0 , 40 ) ;
	}
}