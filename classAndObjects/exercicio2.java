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
			System.out.println("Esta aeronave dever� se aposentar em " + retirement + " anos.");

		}
	
		void displayInfo() {
			System.out.println("O id do avi�o �: " + this.id);
			System.out.println("A dimens�o do avi�o �: " + this.dimensions + " p�s.");
			System.out.println("A idade do avi�o �: " + this.age);
			System.out.println("O pilote �: " + this.pilot);
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
