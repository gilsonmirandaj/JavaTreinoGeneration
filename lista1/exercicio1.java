package exercicioJava;

import java.util.*;

public class exercicio1 {
	public static void main(String[] args) {
		
		Scanner tempo = new Scanner(System.in);
		System.out.println("Insira o n�mero de anos: ");
		int anos = tempo.nextInt();
		
		System.out.println("Insira o n�mero de meses: ");
		int meses = tempo.nextInt();
		
		System.out.println("Insira o n�mero de dias: ");
		int dias = tempo.nextInt();
		
		int idadeEmDias = (anos * 365 + meses * 30 + dias);
		
		System.out.println("Sua idade em dias � igual a: " + idadeEmDias);

		
	}
}

