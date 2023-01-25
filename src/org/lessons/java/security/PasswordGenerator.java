package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname;
		String lname;
		String favColor;
		int birthDay;
		int birthMonth;
		int birthYear;
		String pwd;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome:");
		fname = input.nextLine();
		
		System.out.println("Inserisci il tuo cognome:");
		lname = input.nextLine();
		
		System.out.println("Inserisci il tuo colore preferito:");
		favColor = input.nextLine();
		
		System.out.println("Inserisci il giorno in cui sei nato:");
		birthDay = input.nextInt();
		
		
	}
}