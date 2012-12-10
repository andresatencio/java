package Hoja2;
import java.util.Scanner;

public class Comparacion {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.print("Escriba el primer numero: ");
		n1 = entrada.nextInt();
		System.out.print("Escriba el segundo numero: ");
		n2 = entrada.nextInt();
		
		if(n1 == n2) 
			System.out.printf("%d == %d \n",n1,n2);
		if(n1 != n2)
			System.out.printf("%d != %d \n",n1,n2);
		if(n1 > n2)
			System.out.printf("%d > %d \n",n1,n2);
		if(n1 < n2)
			System.out.printf("%d < %d \n",n1,n2);
	}
	
}
