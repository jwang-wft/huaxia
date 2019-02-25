package org.huaxia;

public class Operators {

	public static void main(String[] args) {
		boolean b = false;
		int h = 5;
		int l = 9;
		int m = 9;
		System.out.println(!b);
		System.out.println(h==l);
		System.out.println(h!=l);
		System.out.printf("m=%d\n", m);
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
