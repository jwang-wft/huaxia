package org.huaxia.test;

import org.huaxia.Point;
import org.huaxia.Rectangle;
import org.huaxia.Shape;
import org.huaxia.Square;

public class ShapeTester {

	public static void main(String[] args) {
		Square s = new Square(new Point(1.0, 1.0), 5.0);
		printShape(s);
		Rectangle r = new Rectangle(new Point(2.1, 1.5), 3.4, 5.1);
		printShape(r);
	}

	// 1. build up a concept of inheritance, every class extends from Object class;
	// 2. one place do same thing;
	// 3. if need change, only change one place (for instance, send to printer)
	// 4. Polymorphism （抽象性abstract； 继承性inheritance； 封闭性encapsulation；
	// 多样性Polymorphism)
	public static void printShape(Shape s) {
		System.out.println(s);
	}
}
