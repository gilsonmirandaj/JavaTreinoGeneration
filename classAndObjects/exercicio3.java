package classAndObjects;

import java.util.ArrayList;

class EletronicProduct{
	int id;
	double price;
	String category;
	boolean refurbish;
	double discount;
	int tvItens = 0, radioItens = 0, cellphoneItens = 0;

	public EletronicProduct(int id, double price, String category, boolean refurbish) {
		this.id = id;
		this.price = price;
		this.category = category;
		this.refurbish = refurbish;
	}
	
	
	void productCategoryList(){
		
		if(category.contains("TV")) {
			ArrayList<String> TV = new ArrayList<String>();
			TV.add(this.category);
			tvItens ++;
			System.out.println("Foram registrados: " + tvItens + " TVs." + TV);
		}
		else if(category.contains("Radio")) {
			ArrayList<String> Radio = new ArrayList<String>();
			Radio.add(this.category);
			radioItens ++;
			System.out.println(Radio);
			System.out.println("Foram registrados: " + radioItens + " celulares." + Radio);


		}
		else if(category.contains("Celular")) {
			ArrayList<String> Cellphone = new ArrayList<String>();
			Cellphone.add(this.category);
			cellphoneItens ++;
			System.out.println("Foram registrados: " + cellphoneItens + " celulares." + Cellphone);
		}
		
		else {
			System.out.println("N�s n�o trabalhamos com este tipo de produto.");
		}	
		
	}
	
	void refurbishDiscount() {
		if(refurbish) {
			System.out.println("Este produto � novo. Portanto, n�o se tem desconto.");
		}
		else {
			discount = (this.price * 0.95);
			System.out.println("Este produto tem 5% de desconto por n�o ser novo. Seu pre�o �: " + discount);
		}
	}

	void printProduct() {
		System.out.println("O id do produto �: " + this.id);
		System.out.println("O pre�o do produto �: R$" + this.price);
		System.out.println("A categoria do produto �: " + this.category);
		System.out.println("O produto � novo? " + this.refurbish);

	}
}
	public class exercicio3 {
		public static void main(String[] args) {
			EletronicProduct product1 = new EletronicProduct(1, 20, "TV", true);
			EletronicProduct product2 = new EletronicProduct(1, 50, "Radio", false);			
			
			product1.printProduct();
			product1.refurbishDiscount();
			product2.productCategoryList();
			
		}
}
