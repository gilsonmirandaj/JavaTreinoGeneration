package exercicioJava;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		double a, b, c;
		
		Scanner values = new Scanner(System.in);		
		System.out.println("Digite o valor de a: ");
		a = values.nextDouble();	
		
		System.out.println("Digite o valor de b: ");
		b = values.nextDouble();	
		
		System.out.println("Digite o valor de c: ");
		c = values.nextDouble();	
		
		double weightA = (a * 2);
		double weightB = (b * 3);
		double weightC = (c * 5);		
		
		double finalScore = ((weightA + weightB + weightC) / 10);
		
		System.out.println("Sua média final é igual a " + finalScore);
	}
}
