package listaRepeticao;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		int age, fellings, sex, ageCount = 0, interviewed = 0, numberFem = 0, numberMas = 0, numberOther = 0;
		int calmPerson = 0, nervousPerson = 0, agressivePerson = 0, nervousWomen = 0, agressiveMens = 0, calmOthers = 0;
		int nervousForty = 0, calmEighteen = 0;
		
	while(ageCount < 150) {
		Scanner values = new Scanner(System.in);		
		System.out.println("Digite a sua idade: ");
		age = values.nextInt();	
		
		System.out.println("Digite o número correspodente ao seu sexo, sendo 1 para feminino, 2 para masculino e 3 para outro: ");
		sex = values.nextInt();	
			switch(sex) {		
				case 1: numberFem++;
				case 2: numberMas++;
				case 3: numberOther++;
			}
			
		System.out.println("Digite 1 se estiver calmo, 2 se estiver nervoso e 3 se estiver agressivo:");
		fellings = values.nextInt();	
			switch(fellings) {		
				case 1: calmPerson++;
				case 2: nervousPerson++;
				case 3: agressivePerson++;
				}
			
			if(sex == 1 && fellings == 2) {
				nervousWomen++;
			}
			
			else if(sex == 2 && fellings == 3) {
				agressiveMens++;
			}
			
			else if(sex == 3 && fellings == 1) {
				calmOthers++;
			}
			
			else if(age > 40 && fellings == 2) {
				nervousForty++;
			}
			
			else if(age < 18 && fellings == 1) {
				calmEighteen++;
			}
			
		ageCount++;
		
		}
	
		System.out.println("O número de pessoas calmas é: " + calmPerson);
		System.out.println("O número de mulheres nervosas é: " + nervousWomen);
		System.out.println("O número homens agressivos é: " + agressiveMens);
		System.out.println("O número de outros calmos é: " + calmOthers);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: " + nervousForty);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: " + calmEighteen);
	}
}
