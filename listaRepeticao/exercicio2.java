package listaRepeticao;

import java.util.*;

public class exercicio2 {
	public static void main(String[] args) {
		int counter = 0, odd = 0, even = 0, numbers;
		
		for(counter = 0; counter < 10; counter ++) {
		Scanner values = new Scanner(System.in);
   	  	System.out.println("Digite um valor: ");
   	  	
		numbers = values.nextInt();
   	  	
			if(numbers % 2 == 0) {
				odd++;
			}
			else if(numbers % 2 != 0) {
				even++;
			}
		}
		
		System.out.println("Em sua lista há " + odd + " números pares e " + even + " números ímpares.");
	}
}
