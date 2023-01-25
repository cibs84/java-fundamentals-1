package org.lessons.java.general;

import java.util.Scanner;

public class PollCreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win;
		int mac;
		int linux;
		int students;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci numero studenti che usano Windows:");
		win = input.nextInt();
		
		System.out.println("Inserisci numero studenti che usano MacOS:");
		mac = input.nextInt();
		
		System.out.println("Inserisci numero studenti che usano Linux:");
		linux = input.nextInt();
		
		students = win+mac+linux;
		
		double percentWin = (double) (win * 100) / students;
		double percentMac = (double) (mac * 100) / students;
		double percentLinux = (double) (linux * 100) / students;
		
		System.out.println("Risultato Sondaggio - " + "Numero Studenti " + students);
		System.out.println("Windows: " + percentWin + "%");
		System.out.println("MacOS: " + percentMac + "%");
		System.out.println("Linux: " + percentLinux + "%");
	}
}
