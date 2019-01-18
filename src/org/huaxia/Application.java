package org.huaxia;

public class Application {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle();
		bicycle.printStates();
		bicycle.speedUp(5);
		bicycle.printStates();
		bicycle.changeCadence(2);
		bicycle.printStates();
		bicycle.changeGear(3);
		bicycle.printStates();
	}

}
