package org.huaxia;

public class Operators {

	public static void main(String[] args) {
		int i = 5;
		float f = 6.5F;
		if (i < f) {
			System.out.printf("i(%d) is less than f(%f).", i, f);
		} else {
			System.out.printf("i(%d) is greater than f(%f).", i, f);
		}
		System.out.println();

		for (i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
