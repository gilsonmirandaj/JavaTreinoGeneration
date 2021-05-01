package exercicioJava;

import java.util.*;

public class exercício6 {
	public static void main(String[] args) {
		
		Scanner pontos = new Scanner(System.in);
		System.out.println("Digite o primeiro ponto: ");
		int x1 = pontos.nextInt();
		
		System.out.println("Digite o segundo ponto: ");
		int x2 = pontos.nextInt();
		
		System.out.println("Digite o terceiro ponto: ");
		int y1 = pontos.nextInt();
		
		System.out.println("Digite o quarto ponto: ");
		int y2 = pontos.nextInt();
		
		double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
		System.out.println("O resultado é: " + d);
	}
}
