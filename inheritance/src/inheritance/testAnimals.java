package inheritance;

public class testAnimals {
public static void main(String[] args) {
		
		Animals dog = new Animals();
		Animals horse = new Animals();
		Animals sloth = new Animals();
		
		
		dog.setName("Belinha");
		dog.setAge(5);
		dog.setVocalization("auau");
		dog.setMoviment("O animal corre.");
		
		horse.setName("Juan");
		horse.setAge(8);
		horse.setVocalization("juan");
		horse.setMoviment("O animal corre.");

		sloth.setName("Pri");
		sloth.setAge(3);
		sloth.setVocalization("...");
		sloth.setMoviment("O animal escala árvores.");
		
		System.out.println("Dados do cachorro");
		System.out.println("Cachorro: " + dog.getName());
		System.out.println("Idade: " + dog.getAge());
		System.out.println(dog.getVocalization());
		System.out.println(dog.getMoviment());

		
		System.out.println("\nDados do cavalo");
		System.out.println("Cavalo: " + horse.getName());
		System.out.println("Idade: " + horse.getAge());
		System.out.println(horse.getVocalization());
		System.out.println(horse.getMoviment());

		
		System.out.println("\nDados preguiça");
		System.out.println("Preguiça: " +  sloth.getName());
		System.out.println("Idade: " + sloth.getAge());	
		System.out.println(sloth.getVocalization());
		System.out.println(sloth.getMoviment());

	}

}
