package exercicioJava;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
			
		Scanner time = new Scanner(System.in);		
		System.out.println("Digite o valor do evento em segundos: ");
		int secondsOperation = time.nextInt();
		
		int hours = (secondsOperation / 3600);
		int minutes = ((secondsOperation % 3600) / 60);
		int seconds = ((secondsOperation % 3600) % 60);

	System.out.println("A operação é: " + hours + " hora " + minutes + " minuto " + seconds + " segundo.");
	}
}
