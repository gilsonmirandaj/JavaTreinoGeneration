package exercicioJava;

import java.util.Scanner;

public class biggestNumber {
	public static void main(String[] args){
	     double biggestNumber, number;
	     int counter = 1;
	     
	     Scanner values = new Scanner(System.in);
	 
	     System.out.print("N�mero 1: ");
	     number = values.nextFloat();
	     biggestNumber = number;
	     
	     counter ++;
	 
	     while(counter <= 3){
		     System.out.print("N�mero " + counter + ": ");
		     number = values.nextFloat();
	 
		     if(number > biggestNumber){
		    	 biggestNumber = number;
		     }
		     counter ++;
	     }
	 
	     System.out.println("O maior numero digitado �: "+ biggestNumber);
	 
	    }
	}
			
