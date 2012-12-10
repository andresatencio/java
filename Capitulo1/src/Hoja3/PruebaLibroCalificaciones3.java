package Hoja3;
import java.util.Scanner;

public class PruebaLibroCalificaciones3 {

	public static void main(String args []){
		LibroCalificaciones3 miLibro = new LibroCalificaciones3("Java");
		miLibro.mostrarMensaje();
		Scanner leer = new Scanner(System.in);
		System.out.print("Escribir otro nombre para el curso: ");
		String msj = leer.nextLine();
		miLibro.setNombreCurso(msj);
		miLibro.mostrarMensaje();
	}
}
