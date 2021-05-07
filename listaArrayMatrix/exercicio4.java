package listaArrayMatrix;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);
		
		int n = 2;
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int[][] mSum = new int [n][n];
		int[][] mMinus = new int [n][n];
		String caracter;

		int l = 0, c = 0, options = 0, cancel = 1;

		System.out.printf("Primeira Matriz\n");
		for  (l = 0; l < 2; l++) {
			System.out.printf("Informe os elementos da %da. linha:\n", (l + 1));
			for (c = 0; c < 2; c++) {
				System.out.printf("a[%d][%d] = ", l, c);
				a[l][c] = values.nextInt();
			}
			System.out.printf("\n");
		}

		System.out.printf("Segunda matriz\n");
		for (l = 0; l < 2; l++) {
			System.out.printf("Informe os elementos da %da. linha:\n", (l + 1));
			for (c = 0; c < 2; c++) {
				System.out.printf("b[%d][%d] = ", l, c);
				b[l][c] = values.nextInt();
			}
		}
		
		do {
			
			System.out.println("Agora, escolha o número da opção desejada: ");
			System.out.println("(1) Somar as duas matrizes");
			System.out.println("(2) Subtrair a primeira matriz da segunda ");
			System.out.println("(3) Adicionar uma constante às matrizes");
			System.out.println("(4) Imprimir as matrizes");
			options = values.nextInt();

			
			switch(options) {
			case 1: 
				for (l = 0; l < n; l++) {
					for (c = 0; c < n; c++) {
						mSum[l][c] = a[l][c] + b[l][c];
					}					
			}
			
			break;
				
			case 2: 
				for (l = 0; l < n; l++) {
					for (c = 0; c < n; c++) {
						mMinus[l][c] = a[l][c] - b[l][c];
					}					
			}
				
			break;
				
			case 3:
				System.out.println("Digite o caractere a ser adicionado às matrizes");
				caracter = values.next();
				
				for (l = 0; l < n; l++) {
					for (c = 0; c < n; c++) {
						a[l][c] += c;
						b[l][c] += c;
					}
					
				}
			break;
				
			case 4:
				System.out.print(mSum[l][c]);
				System.out.print(mMinus[l][c]);

			
			break;

			case 5:
				cancel = 0;
			}
			
		} while(cancel != 0);
		
		}
}