package org.lessons.java.general;

public class CibiPreferiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] favFoods = {"Pizza", "Pesce", "Patatine Fritte", "Mozzarella", "Pomodoro"};
		
		System.out.println("Totale cibi preferiti: "+(favFoods.length));
		System.out.println("Il primo tra i cibi preferiti: "+(favFoods[0]));
		System.out.println("L\'ultimo tra i cibi preferiti: "+(favFoods[favFoods.length - 1]));
	}

}
