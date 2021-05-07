package listaArrayMatrix;

public class exercicio1 {
	public static void main(String[] args) {
		int sum = 0;
		int[] array = new int[6];
		
		array[0] = 1;
		array[1] = 0;		
		array[2] = 5;
		array[3] = -2;
		array[4] = -5;
		array[5] = 7;
		
		sum = array[0] + array[1] + array[5];
		
		System.out.println(sum);
		
		array[4] = 100;
		
		for (int i = 0; i < array.length; i++) {  
            System.out.println(array[i] + " ");  
        };
	}
}
