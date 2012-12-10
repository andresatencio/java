package Hoja3;
import java.util.Scanner;

public class PruebaLibroCalificaciones {
	public static void main(String args []){
		LibroCalificaciones libro = new LibroCalificaciones();
		Scanner leer = new Scanner(System.in);
		System.out.print("Escriba el nombre del curso: ");
		String mensaje = leer.next();
		libro.mostrarMensajes(mensaje);
	}
}
