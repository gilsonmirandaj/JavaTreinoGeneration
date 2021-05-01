package lista3;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		double meanSalary, salarySum = 0.0, meanSons = 0.0, sumSons = 0.0, biggestSalary = 0.0, salaryPercentual, lowestSalaryCounter = 0;
		int interviewed = 3, sonsNumber, counter;
		
		for(counter = 0; counter < interviewed; counter ++) {
			Scanner infos = new Scanner(System.in);
			System.out.println("Digite o salário: ");
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
		
		System.out.println("A média salarial da população é: R$" + meanSalary);
		System.out.println("A taxa de fertilidade da população é: R$" + meanSons);
		System.out.println("o maior salário é: R$" + biggestSalary);
		System.out.println("A porcentagem das pessoas com salários até R$100 é: " + salaryPercentual);
		
	}
}
