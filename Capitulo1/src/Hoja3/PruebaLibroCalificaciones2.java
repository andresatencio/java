package Hoja3;
import java.util.Scanner;

public class PruebaLibroCalificaciones2 {
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);
		LibroCalificaciones2  miLibro = new LibroCalificaciones2();
		System.out.print("El nombre del curso es: "+miLibro.getNombreDelCurso()+"\n");
		System.out.print("Setear nombre de curso: ");
		String msj = leer.nextLine();
		miLibro.setNombreDelCurso(msj);
		System.out.print("El nombre del curso nuevo es: "+miLibro.getNombreDelCurso());
		
	}
	
}
