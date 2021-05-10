package classAndObjects;

class Client {
	int id;
	String name;
	int age;
	double bill;
	
	public Client(int id, String name, int age, double bill) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.bill = bill;
		
		}

	void printClient() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.bill);

		}
	}

	class exercicio1 {

		public static void main(String[] args) {
			Client first = new Client(0, null, 0, 0);
			Client second = new Client(1, "gilson", 24, 1000);
						
			first.printClient();
			second.printClient();
	
	}

}
