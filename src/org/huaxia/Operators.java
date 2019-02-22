package org.huaxia;

public class Operators {

	public static void main(String[] args) {
		boolean b = false;
		System.out.println(!b);
		int h = 5;
		int l = 9;
		int m = 9;
		System.out.println(h==l);
		System.out.println(h!=l);
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
