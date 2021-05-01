package lista2;

import java.util.*;

public class exercício3 {
	public static void main(String[] args) {	
	Scanner numbers = new Scanner(System.in);
	
	System.out.println("Insira o primeiro número: ");
	double number1 = numbers.nextDouble();
	double square1 = Math.pow(number1, 2);
	
	System.out.println("Insira o segundo número: ");
	double number2 = numbers.nextDouble();
	double square2 = Math.pow(number2, 2);
	
	System.out.println("Insira o terceiro número: ");
	double number3 = numbers.nextDouble();
	double square3 = Math.pow(number3, 2);

	
	System.out.println("Insira o quarto número: ");
	double number4 = numbers.nextDouble();
	double square4 = Math.pow(number4, 2);
	
	if(square3 >= 1000){
		System.out.println(square3);
}
	else {
		System.out.println("O primeiro valor é " + number1 + " e seu quadrado é: " + square1);
		System.out.println("O segundo valor é " + number2 + " e seu quadrado é: " + square2);
		System.out.println("O terceiro valor é " + number3 + " e seu quadrado é: " + square3);
		System.out.println("O quarto valor é " + number4 + " e seu quadrado é: " + square4);
		}
	}
}
