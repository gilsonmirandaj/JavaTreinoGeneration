package exercicioJava;

import java.util.*;

public class exercicio8 {
	public static void main(String[] args) {
		
		Scanner partesDoCusto = new Scanner(System.in);
		
		System.out.println("Insira o custo de fábrica: ");
		double custoDeFabrica = partesDoCusto.nextInt();
		
		double custoAoConsumidor = (custoDeFabrica + (custoDeFabrica * 0.28) + (custoDeFabrica * 0.45));
		
		System.out.println("O custo final ao consumidor será de: R$" + custoAoConsumidor);
		
	}
}
