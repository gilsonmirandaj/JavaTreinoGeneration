package listaRepeticao;

public class exercicio1 {
	public static void main(String[] args) {
		int limit = 1999, counter;
		
		for(counter = 1000; counter <= limit; counter ++){
			if(counter % 11 == 5) {
				System.out.println(counter);
			}
		}
	}
}
