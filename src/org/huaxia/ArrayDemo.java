package org.huaxia;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a = { 10, 12, 15, 16, 43, 23 };
		String[] s = {"John", "Charles", "David", "Williams"};
		Bicycle[] bicycles = new Bicycle[2];
		bicycles[0] = new Bicycle("John's Bike");
		bicycles[1] = new Bicycle("Williams' Bike");
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("the array value at index %d is %d\n", i, a[i]);
		}
		System.out.println();
		for (int b : a) {
			System.out.printf("the array value is %d\n", b);
		}
	}

}
