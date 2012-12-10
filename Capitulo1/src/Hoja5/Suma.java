package Hoja5;

public class Suma {
	public static void main(String args[]){
		int suma = 0;
		for(int numero = 2;numero <= 20;numero += 2)
			 suma += numero;
		System.out.printf("La suma es: %d ",suma);
	}
}
