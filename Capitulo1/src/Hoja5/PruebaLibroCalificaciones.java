package Hoja5;

public class PruebaLibroCalificaciones {
	public static void main(String args[]){
		LibroCalificaciones miLibro = new LibroCalificaciones(" JAVA ");
		miLibro.mostrarMensaje();
		miLibro.ingresoDeCalificaciones();
		miLibro.mostrarReporteCalif();
	}
}
