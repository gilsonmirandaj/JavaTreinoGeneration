package exercicioJava;

import java.util.Scanner;

public class category {
	public static void main(String[] args) {
		Scanner age = new Scanner(System.in);		
		System.out.println("Digite sua idade: ");
		int ageAth = age.nextInt();
		
		if(ageAth >= 10 && ageAth <= 14) {
			System.out.println("Categoria infantil.");
		}
		else if(ageAth >= 15 && ageAth <= 17) {
			System.out.println("Categoria juvenil.");
		}
		else if(ageAth >= 18 && ageAth <= 25) {
			System.out.println("Categoria adulto.");
		}
	}
}
