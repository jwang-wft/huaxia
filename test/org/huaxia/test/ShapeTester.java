package org.huaxia.test;

import org.huaxia.Point;
import org.huaxia.Rectangle;
import org.huaxia.Square;

public class ShapeTester {

	public static void main(String[] args) {
		Square s = new Square(new Point(1.0, 1.0), 5.0);
		printShape(s);
		Rectangle r = new Rectangle(new Point(2.1, 1.5), 3.4, 5.1);
		printShape(r);
	}

	// 1. build up a concept of inheritance, every class extends from Object;
	// 2. one place do same thing;
	// 3. if need change, only change one place (for instance, send to printer)
	public static void printShape(Object obj) {
		if(obj instanceof Square) {
			Square s = (Square)obj;
			System.out.printf("the area of the square at point %s is %5.2f.\n", s.getTopLeft(), s.area());
		}
		if(obj instanceof Rectangle) {
			Rectangle r = (Rectangle)obj;
			System.out.printf("the area of the rectangle at point %s is %5.2f.\n", r.getTopLeft(), r.area());
		}
	}
}
