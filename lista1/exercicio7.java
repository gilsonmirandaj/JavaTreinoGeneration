package exercicioJava;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		
		int a, b, c, d, f, g;
		
		Scanner values = new Scanner(System.in);		
		System.out.println("Digite o valor de a: ");
		a = values.nextInt();	
		
		System.out.println("Digite o valor de b: ");
		b = values.nextInt();	
		
		System.out.println("Digite o valor de c: ");
		c = values.nextInt();	
		
		System.out.println("Digite o valor de d: ");
		d = values.nextInt();	
		
		System.out.println("Digite o valor de f: ");
		f = values.nextInt();	
		
		System.out.println("Digite o valor de g: ");
		g = values.nextInt();	
		
		double x = ((c * f) - (b * g) / (a * f) - (b * d));
		double y = ((a * g) - (c * a) / (a * f) - (b * d));
		
		System.out.println("O valor de X é " + x + " e o valor de y é " + y);
		
	}
}
