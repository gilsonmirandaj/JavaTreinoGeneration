package exercicioJava;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
			
		Scanner values = new Scanner(System.in);		
		System.out.println("Digite o valor de a: ");
		int a = values.nextInt();	

		System.out.println("Digite o valor de b: ");
		int b = values.nextInt();
	
		System.out.println("Digite o valor de c: ");
		int c = values.nextInt();
			
		double r = ((a + b) ^ 2 );
		double s = ((b + c) ^ 2 );
		double d = (r + s / 2);
		
		System.out.println("O resultado da expressão é: " + d);
	}
}
