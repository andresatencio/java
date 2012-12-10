package Hoja3;
import javax.swing.*;

public class DialogoNombre {
	public static void main(String args []){
		String nombre = JOptionPane.showInputDialog("Cual es tu nombre? ");
		String msj = String.format("Bienvenido, %s, a la programacion en Java", nombre);
		JOptionPane.showMessageDialog(null, msj);
	}
}
