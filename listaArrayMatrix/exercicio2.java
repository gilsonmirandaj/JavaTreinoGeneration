package listaArrayMatrix;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		int evenTotal = 0, oddTotal = 0, sumEven = 0, sumOdd = 0;
		
		int [] array = new int [6];
		List<Integer> arrayEven = new ArrayList<>();
	    List<Integer> arrayOdd = new ArrayList<>();
		
		for(int i = 0; i < array.length; i++) {
			Scanner valuesInserted = new Scanner(System.in);	
	     	System.out.println("Digite um valor: ");
	     	
	     	array[i] = valuesInserted.nextInt();
	     	
	     	if(array[i] % 2 == 0) {
		     	arrayEven.add(array[i]);
	     		sumEven += array[i];
	     		evenTotal++;

	     	}
	     	
	     	else if(array[i] % 2 != 0) {
		     	arrayOdd.add(array[i]);
	     		sumOdd += array[i];
	     		oddTotal++;
	     	}
		}
	     	
	     System.out.println("Os n�meros pares digitados s�o \n" + (arrayEven));
	     System.out.println("A soma dos n�meros pares digitados �: " + sumEven);
	     System.out.println("Os n�meros �mpares digitados s�o: " + (arrayOdd));
	     System.out.println("A quantidade de n�meros �mpares digitados �: " + (arrayOdd.size()));

		}
	}
