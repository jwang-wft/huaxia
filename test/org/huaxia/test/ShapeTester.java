package org.huaxia.test;

import org.huaxia.Point;
import org.huaxia.Rectangle;
import org.huaxia.Square;

public class ShapeTester {

	public static void main(String[] args) {
		Square s = new Square(new Point(1.0, 1.0), 5.0);
		System.out.printf("the area of the square at point %s is %5.2f.\n", s.getTopLeft(), s.area());
		Rectangle r = new Rectangle(new Point(2.1, 1.5), 3.4, 5.1);
		System.out.printf("the area of the rectangle at point %s is %5.2f.\n", r.getTopLeft(), r.area());
	}

}
