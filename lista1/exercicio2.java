package exercicioJava;

import java.util.*;

public class exercicio2 {
	public static void main(String[] args) {
		
		Scanner time = new Scanner(System.in);
		System.out.println("Insira o número de dias: ");
		int daysData = time.nextInt();
		

		int years = (daysData / 365);
		int months = ((daysData % 365) / 30);
		int days = ((daysData % 365) % 30);

		System.out.println("\nSua idade equivale a: " + years + " ano " + months + " mês e " + days + " dias.");
	
	}

}
	