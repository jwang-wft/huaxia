package org.huaxia;

public class Application {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle("John's Bicycle");
		bicycle.printStates();
		bicycle.speedUp(5);
		bicycle.printStates();
		bicycle.changeCadence(2);
		bicycle.printStates();
		bicycle.changeGear(3);
		bicycle.printStates();
		
		Bicycle bicycle1 = new Bicycle("Harrison's Bicycle");
		bicycle1.printStates();
		bicycle1.speedUp(2);
		bicycle1.printStates();
		bicycle1.changeCadence(4);
		bicycle1.printStates();
		bicycle1.changeGear(6);
		bicycle1.printStates();
		
	}

}
