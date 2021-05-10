package classAndObjects;

class Aeroplane{
	
	int id;
	int dimensions;
	int age;
	String pilot;
	String airport;
	int retirement;
		
		public Aeroplane(int id, int dimensions, int age, String pilot, String airport) {
			this.id = id;
			this.dimensions = dimensions;
			this.age = age;
			this.pilot = pilot;
			this.airport = airport;
		}
		
		void airplaneRepair() {
			retirement = 40 - age;
			System.out.println("Esta aeronave deverá se aposentar em " + retirement + " anos.");

		}
	
		void displayInfo() {
			System.out.println("O id do avião é: " + this.id);
			System.out.println("A dimensão do avião é: " + this.dimensions + " pés.");
			System.out.println("A idade do avião é: " + this.age);
			System.out.println("O pilote é: " + this.pilot);
			System.out.println("O hangar ficar no aeroporto: " + this.airport);
		}
	}
		public class exercicio2 {
			public static void main(String[] args) {
				Aeroplane aer1 = new Aeroplane(1, 25, 40, "Ana", "Berlim");
				Aeroplane aer2 = new Aeroplane(2, 40, 30, "Gilson", "Split");

				aer1.displayInfo();				
				aer2.displayInfo();

				aer1.airplaneRepair();
				aer2.airplaneRepair();
				
			}

}
