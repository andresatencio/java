package Patrones;

public class PatronPrueba {

	private String nombre;

	private PatronPrueba(){
		
	}
	
	static PatronPrueba GeneraObjeto(){
		return new PatronPrueba();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void mostrar() {
		System.out.print("SALIOOOOOOOOOOOOO");
	}
	
}
