package org.huaxia;

public class ShapeTester {

	public static void main(String[] args) {
		Square s = new Square(new Point(1.0, 1.0), 5.0);
		System.out.printf("the area of the square at point %s is %5.2f.\n", s.topLeft, s.area());
	}

}
