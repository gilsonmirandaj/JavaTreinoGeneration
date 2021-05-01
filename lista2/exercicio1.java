package lista2;

import java.util.*;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner tomate = new Scanner(System.in);
		System.out.println("Digite peso: ");
		
		double weight = tomate.nextDouble();
		double overWeight = weight - 50;
		
		
		if(weight > 50) {
			double finalPrice = overWeight * 4;
			System.out.println("Limite excedido em: " + overWeight + "kg. Sua multa é de: R$" + finalPrice);

		}
		
		else {
			System.out.println("Sem multas.");
		}

	}

}
