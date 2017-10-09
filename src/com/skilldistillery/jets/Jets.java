package com.skilldistillery.jets;

public class Jets {

	private String model; // User story #2
	private float speed;
	private int range;
	private double price;

	// Constructor
	public Jets(String model, float speed, int range, double price) {
		this.model = model;
		this.speed = (float) (speed * 0.001303);
		this.range = range;
		this.price = price;
	}

	// Getters and setters
	public Jets() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(5); // toString to print aircraft
		builder.append("Model: ");
		builder.append(model);
		builder.append("\nMach: ");
		builder.append(speed);
		builder.append("\nRange: ");
		builder.append(range);
		builder.append("\nPrice in millions: $");
		builder.append(price);
		builder.append("\n");
		return builder.toString();
	}
}