package listaArrayMatrix;

import java.util.Scanner;

public class exercício3 {
	public static void main(String[] args) {
		int contTeen = 0;
		int matrix[][] = new int[3][3];
		Scanner valuesInserted = new Scanner(System.in);
		
		for(int l = 0; l < matrix.length; l ++) {
			for(int c = 0; c < matrix.length; c ++) {
				
				System.out.printf("\nDigite as notas: ", l, c);
				matrix[l][c] = valuesInserted.nextInt();
				
				if(matrix[l][c] > 10) {
					contTeen++;
				}
			}
	
			System.out.print("\n");
		}
		
		System.out.println("A quantidade de valores maiores que dez é: " + contTeen + ".");
	}
}
