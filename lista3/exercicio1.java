package lista3;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		double meanSalary, salarySum = 0.0, meanSons = 0.0, sumSons = 0.0, biggestSalary = 0.0, salaryPercentual, lowestSalaryCounter = 0;
		int interviewed = 3, sonsNumber, counter;
		
		for(counter = 0; counter < interviewed; counter ++) {
			Scanner infos = new Scanner(System.in);
			System.out.println("Digite o sal�rio: ");
			double salary = infos.nextDouble();
			
			System.out.println("Digite a quantidade de filhos: ");
			sonsNumber = infos.nextInt();
				
			salarySum = salarySum + salary;
			sumSons = sumSons + sonsNumber;
			
			if(salary <= 100) {
				lowestSalaryCounter ++;
			}
			
			else if(biggestSalary < salary) {
				biggestSalary = salary;
			}
			
		}
		
		meanSalary = salarySum / interviewed;
		meanSons = sumSons / interviewed;
		salaryPercentual = ((lowestSalaryCounter / interviewed) * 100.0);
		
		System.out.println("A m�dia salarial da popula��o �: R$" + meanSalary);
		System.out.println("A taxa de fertilidade da popula��o �: R$" + meanSons);
		System.out.println("o maior sal�rio �: R$" + biggestSalary);
		System.out.println("A porcentagem das pessoas com sal�rios at� R$100 �: " + salaryPercentual);
		
	}
}
