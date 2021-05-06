package listaRepeticao;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		int age = 0, zoomers = 0, boomers = 0;
		
		while(age != -99) {
			Scanner ageValues = new Scanner(System.in);	
	     	System.out.println("Digite a idade: ");
	     	
			age = ageValues.nextInt();
			
			if(age < 21 && age >= 0) {
				zoomers++;
			}
			
			else if(age > 50) {
				boomers++;
			}
		}
		
		System.out.println("O total de pessoas com menos de 21 anos é: " + zoomers);
		System.out.println("O total de pessoas mais de 50 anos é: " + boomers);
	}
}
