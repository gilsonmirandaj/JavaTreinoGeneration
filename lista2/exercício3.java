package lista2;

import java.util.*;

public class exerc�cio3 {
	public static void main(String[] args) {	
	Scanner numbers = new Scanner(System.in);
	
	System.out.println("Insira o primeiro n�mero: ");
	double number1 = numbers.nextDouble();
	double square1 = Math.pow(number1, 2);
	
	System.out.println("Insira o segundo n�mero: ");
	double number2 = numbers.nextDouble();
	double square2 = Math.pow(number2, 2);
	
	System.out.println("Insira o terceiro n�mero: ");
	double number3 = numbers.nextDouble();
	double square3 = Math.pow(number3, 2);

	
	System.out.println("Insira o quarto n�mero: ");
	double number4 = numbers.nextDouble();
	double square4 = Math.pow(number4, 2);
	
	if(square3 >= 1000){
		System.out.println(square3);
}
	else {
		System.out.println("O primeiro valor � " + number1 + " e seu quadrado �: " + square1);
		System.out.println("O segundo valor � " + number2 + " e seu quadrado �: " + square2);
		System.out.println("O terceiro valor � " + number3 + " e seu quadrado �: " + square3);
		System.out.println("O quarto valor � " + number4 + " e seu quadrado �: " + square4);
		}
	}
}
