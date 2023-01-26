package org.lessons.java.general;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float eurPerKm = 0.21F;
		int discountO65 = 40;
		int discountU18 = 20;
		float price;
		float finalPrice = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Quanti Km devi percorrere?");
		int km = Integer.parseInt(s.nextLine());
		
		System.out.println("Quanti anni hai?");
		int age = Integer.parseInt(s.nextLine());
		
		price = km*eurPerKm;
		
		if (age < 18) {
			finalPrice = (float) (price*0.8);
		} else if (age > 65) {
			finalPrice = (float) (price*0.6);
		} else {
			finalPrice = price;
		}
		
		System.out.println("Il costo del biglietto è di " + finalPrice +"€");
	}

}
