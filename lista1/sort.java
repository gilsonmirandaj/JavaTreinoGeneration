/* Exerc�cio adicional 2
* Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
*/

package exercicioJava;

import java.util.Arrays; // classe para ordenar arrays
import java.util.Scanner;

public class sort {
   public static void main(String[] args) {
       
      int[] array = new int[3]; //cria��o de array
      
      for (int counter = 0; counter < array.length; counter++) { 
          Scanner values = new Scanner(System.in);    
           System.out.println("Digite um valor: ");
          
          array[counter] = values.nextInt(); //introdu��o de valor no array de acordo com o contador (0 a 3)
          
      }
      
      Arrays.sort(array);//ordenar crescentemente os valores do array
      System.out.println("Os n�meros ordandos s�o: " + Arrays.toString(array)); //exibir os valores do array convertidos para string (visualiza��o como array)
   }
}