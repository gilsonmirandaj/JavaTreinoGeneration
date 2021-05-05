package exercicioJava;

import java.util.Scanner;

public class oddOrEven {
	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);		
		System.out.println("Digite um valor: ");
		double number = values.nextDouble();	
		
		if(number % 2 == 0) {
			double sqrNumber = Math.sqrt(number);
			System.out.println("O número é par e sua raíz é: " + Math.round(sqrNumber * 100.0) / 100.0);
		}
		
		else if(number % 2 != 0) {
			double powNumber = Math.pow(number, 2);
			System.out.println("O número é impar e seu quadrado é: " + powNumber);
		}
	}
}
