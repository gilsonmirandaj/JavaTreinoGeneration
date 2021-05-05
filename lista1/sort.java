/* Exercício adicional 2
* Faça um programa que entre com três números e coloque em ordem crescente.
*/

package exercicioJava;

import java.util.Arrays; // classe para ordenar arrays
import java.util.Scanner;

public class sort {
   public static void main(String[] args) {
       
      int[] array = new int[3]; //criação de array
      
      for (int counter = 0; counter < array.length; counter++) { 
          Scanner values = new Scanner(System.in);    
           System.out.println("Digite um valor: ");
          
          array[counter] = values.nextInt(); //introdução de valor no array de acordo com o contador (0 a 3)
          
      }
      
      Arrays.sort(array);//ordenar crescentemente os valores do array
      System.out.println("Os números ordandos são: " + Arrays.toString(array)); //exibir os valores do array convertidos para string (visualização como array)
   }
}