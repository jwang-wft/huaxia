package org.huaxia;

public class ShapeTester {

	public static void main(String[] args) {
		Point p = new Point(1.0, 1.0);
		Square s = new Square(p, 5.0);
		double area = s.area();
		System.out.printf("the area of the square at point (%3.1f, %3.1f) is %5.2f.\n", s.topLeft.x, s.topLeft.y, area);
	}

}
