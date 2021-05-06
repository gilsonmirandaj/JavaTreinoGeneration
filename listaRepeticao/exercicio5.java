package listaRepeticao;

import java.util.*;

public class exercicio5 {
	public static void main(String[] args) {
		int sum = 0, num;
		
		do {
			Scanner values = new Scanner(System.in);		
			System.out.println("Digite um número do teclado: ");
			num = values.nextInt();	
		
			if(num != 0) {
				sum += num;
			}
			
		} while(num > 0);
		
		System.out.println("A soma dos números é: " + sum);
	}
	
}
