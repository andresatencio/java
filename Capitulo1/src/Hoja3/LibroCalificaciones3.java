package Hoja3;

public class LibroCalificaciones3 {

	private String nombreCurso;
	
	public LibroCalificaciones3(String msj){
		this.nombreCurso = msj;
	}
	public void setNombreCurso(String msj){
		this.nombreCurso = msj;
	}
	public String getNombreCurso(){
		return this.nombreCurso;
	}
	public void mostrarMensaje(){
		System.out.println("El nombre del curso es: "+this.getNombreCurso());
	}
}
