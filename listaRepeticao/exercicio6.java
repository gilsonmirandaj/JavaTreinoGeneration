package listaRepeticao;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		int num, divThree = 0, sum = 0;
		double mean = 0;
		
		do {
			Scanner values = new Scanner(System.in);		
			System.out.println("Digite um número do teclado: ");
			num = values.nextInt();	
		
			if(num != 0 && num % 3 == 0) {
				divThree++;
				sum += num;
			}
			
			mean = sum / divThree;
		} while(num > 0);
		
		System.out.println("A média dos múltiplos de 3 digitados é: " + mean);
	}
}
