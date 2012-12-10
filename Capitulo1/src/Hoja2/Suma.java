package Hoja2;

import java.util.Scanner;

public class Suma {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int resultado;
		
		System.out.print("Ingrese el primer numero: ");
		n1 = sc.nextInt();
		System.out.print("Ingrese el segundo numero: ");
		n2 = sc.nextInt();
		resultado = n1 + n2;
		System.out.println("La suma de los nuemros es: "+resultado);
	}
	
}
