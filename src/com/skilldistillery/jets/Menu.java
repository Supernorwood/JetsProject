package com.skilldistillery.jets;

import java.util.Scanner;

public class Menu {
	Scanner s = new Scanner(System.in);
	Hangar menu = new Hangar();

	public void jetsMenu() {

		int menuOption = 0;

		// User story #1
		do {
			System.out.println("Enter 1-5 to select an option off of Menu:");
			System.out.println("1 - List fleet");
			System.out.println("2 - View fastest jet");
			System.out.println("3 - View jet with longest range");
			System.out.println("4 - Add jet to fleet");
			System.out.println("5 - Quit");
			menuOption = s.nextInt();
			System.out.println();

			if (menuOption < 1 || menuOption > 5) {
				System.out.println("Please enter an option from the menu");
				menuOption = s.nextInt();
				System.out.println();
			}

			switch (menuOption) {
			case 1:
				menu.jetList();
				break;
			case 2:
				menu.fastest();
				break;
			case 3:
				menu.longest();
				break;
			case 4:
				menu.addJet();
				break;
			}

		} while (menuOption != 5);

		System.out.println("Quit"); // User Story #4
		s.close();
	}
}
