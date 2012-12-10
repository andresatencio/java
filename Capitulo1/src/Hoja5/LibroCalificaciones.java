package Hoja5;

import java.util.Scanner;

public class LibroCalificaciones {

	private String nombreDeCurso;
	private int total, contadorCalif, aC, bC, cC, dC, eC;
	
	public LibroCalificaciones(String nombre){
		this.nombreDeCurso = nombre;
	}
	
	public void setNombreDeCurso(String nombre){
		this.nombreDeCurso = nombre;
	}
	public String getNombreDeCurso(){
		return this.nombreDeCurso;
	}
	
	public void mostrarMensaje(){
		System.out.printf("Bienvenido al libro de calificaciones de: %s ",this.nombreDeCurso);
	}
	public void ingresoDeCalificaciones(){
		Scanner entrada = new Scanner(System.in);
		int calificacion;
		
		System.out.printf("%s\n%s\n%s\n%s\n%s","\nEscriba calificaciones del 1 al 100","Escriba indicador de fin de archivos: ","**En Linux, Unix o Mac <ctrl> D y Enter","**En Windows escriba <ctrl> Z y Enter","\n--->");
		
		while(entrada.hasNext()){
			calificacion = entrada.nextInt();
			total += calificacion;
			++contadorCalif;
			incrCalificadorLetra(calificacion);
			}
	}
		public void incrCalificadorLetra(int calif){
			
			switch(calif/10){
							case 9:
							case 10:
								++aC;
							break;
							
							case 8:
								++bC;
							break;
							
							case 7:
								++cC;
							break;
							
							case 6:
								++dC;
							break;
							
							default:
								++eC;
								break;
							
			}
		}
		
		public void mostrarReporteCalif(){
			System.out.println("\nReporte calificaciones: ");
			if(contadorCalif != 0){
				
				double promedio = (double) total / contadorCalif;
				
				System.out.printf("El TOTAL de las %d calificaciones introducidas es %d\n",contadorCalif,total);
				System.out.printf("El promedio de la clase es %.2f\n",promedio);
				System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n","Numero de estudiantes que recibieron cada calificacion: ",
						"A: ",aC,
						"B: ",bC,
						"C: ",cC,
						"D: ",dC,
						"E: ",eC);
			} else 
				System.out.println("No se ingresaron calificaciones");
		}
	}

