package Hoja5;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Figuras extends JPanel {
	
	private int opcion;
	
	public Figuras(int opcion){
		this.opcion = opcion;
	}
	
	public void paintComponent(Graphics g){
		
		super.paintComponents(g);
		for(int i = 0; i<=5;i++){
			switch (this.opcion){
			case 1:
				//g.drawRect(arg0, arg1, arg2, arg3)
				//g.drawRect(150 - i * 5, 150 - i * 5, 10 + i * 5, 10 + i * 5);
				break;
			case 2:
				g.drawOval(10 + i*10,10 + i+ 10,200 + (i * 10), 200 + (i * 10));
				break;
			}
		}
	}
}
