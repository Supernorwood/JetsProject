package com.skilldistillery.jets;

import java.util.Scanner;

public class Hangar {
	Jets jet[] = new Jets[15];

	// User Story #2
	public Hangar() {
		jet[0] = new Jets("Runner", 750, 200, 5.0);
		jet[1] = new Jets("Gunner", 800, 2300, 10.0);
		jet[2] = new Jets("Boomer", 1200, 1500, 15.0);
		jet[3] = new Jets("Seargent", 1250, 1900, 20.0);
		jet[4] = new Jets("Margin", 1750, 2500, 25.0);

	}

	// User Story #3 (print out)
	public void jetList() {
		for (int i = 0; i < jet.length; i++) {
			if (jet[i] != null) {
				System.out.println(jet[i].toString());
			}
		}
	}

	// User Story #3 (fastest jet)
	public void fastest() {
		Jets fastest = jet[0];
		for (int i = 0; i < jet.length; i++) {
			if (jet[i] != null) {
				if (fastest.getSpeed() < jet[i].getSpeed()) {
					fastest = jet[i];
				}
			}
		}
		System.out.println("The fastest aircraft is: \n" + fastest);
	}

	// User Story #3 (longest range)
	public void longest() {
		Jets longest = jet[0];
		for (int i = 0; i < jet.length; i++) {
			if (jet[i] != null) {
				if (longest.getRange() < jet[i].getRange()) {
					longest = jet[i];
				}
			}
		}
		System.out.println("The aircraft with the longest range is: \n" + longest);
	}

	// User Story #5
	public void addJet() {
		for (int i = 0; i < jet.length; i++) {
			if (jet[i] == null) {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				System.out.println("Enter model of aircraft: ");
				String model = s.next();
				System.out.println("Enter speed in MPH: ");
				float speed = s.nextFloat();
				System.out.println("Enter range in miles: ");
				int range = s.nextInt();
				System.out.println("Enter price in millions: ");
				double price = s.nextDouble();
				jet[i] = new Jets(model, speed, range, price);
				break;
			}
		}
	}

}