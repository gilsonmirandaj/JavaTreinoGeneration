package lista2;

import java.util.*;

public class exercicio4 {
	public static void main(String[] args) {
		Scanner IntergerNumber = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro:");
		double number = IntergerNumber.nextInt();
		
		if(number % 2 == 0 && number > 0) {
			System.out.print("Este número é par e positivo.");
		}
		
		else if(number % 2 == 0 && number < 0){
			System.out.print("Este número é par e negativo.");
		}
		
		else if(number % 2 != 0 && number > 0){
			System.out.print("Este número é ímpar e positivo.");
		}
		
		else if(number % 2 != 0 && number < 0){
			System.out.print("Este número é ímpar e negativo.");
		}
		
	}
}
