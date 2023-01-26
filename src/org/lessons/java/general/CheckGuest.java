package org.lessons.java.general;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] guests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeili"};
		boolean isGuest = false;
		
		System.out.println("Inserisci il tuo nome per controllare se sei in lista");
		String userName = input.nextLine().trim().toLowerCase();
		
		for (int i = 0; i < guests.length; i++) {
			String guest = guests[i].toLowerCase();
			
			if (guest.equalsIgnoreCase(userName)) {
				isGuest = true;
				System.out.println("Lei è in lista. I signori Ferragnez le danno il benvenuto");
				break;
			}
		}
		if (!isGuest) {
			System.out.println("Siamo spiacenti ma lei non è nella lista degli invitati");
		}
		
		input.close();
	}
}
