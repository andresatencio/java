package Hoja2;
import java.util.Scanner;

public class Promedio {
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int n1,n2,n3;
		float res;
		System.out.print("Escriba el primer numero: ");
		n1 = entrada.nextInt();
		System.out.print("Escriba el segundo numero: ");
		n2 = entrada.nextInt();
		System.out.print("Escriba el tercer numero: ");
		n3 = entrada.nextInt();
		res = (n1+n2+n3)/3;
		System.out.print("Promedio de los tres numeros: "+res);
		}
	}

