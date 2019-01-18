package org.huaxia;

class Bicycle {
	private String name;
	private int cadence = 0;
	private int speed = 0;
	private int gear = 1;

	public Bicycle(String nameInput) {
		name = nameInput;
	}
	
	void changeCadence(int newValue) {
		cadence = newValue;
	}

	void changeGear(int newValue) {
		gear = newValue;
	}

	void speedUp(int increment) {
		speed = speed + increment;
	}

	void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	void printStates() {
//		System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
		System.out.printf("Name: %s; cadence: %d; speed: %d; gear: %d\n", name, cadence, speed, gear);
	}
}