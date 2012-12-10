package Hoja5;

import javax.swing.*;

public class PruebaFiguras {

	public static void main(String args[]){
		
		String entrada = JOptionPane.showInputDialog("Escriba 1 para dibujar rectangulos\n Escriba 2 para" +
				"dibujar ovalos");
		int opcion = Integer.parseInt(entrada);
		Figuras panel = new Figuras(opcion);
		
		JFrame app = new JFrame();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300, 300);
		app.setVisible(true);
	}
}
