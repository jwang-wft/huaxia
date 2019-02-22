package org.huaxia;

public class ShapeTester {

	public static void main(String[] args) {
		Square s = new Square();
		s.x = 1.0;
		s.y = 1.0;
		s.side = 5;
		double area = s.area();
		System.out.printf("the area of the square at point (%3.1f, %3.1f) is %5.2f.\n", s.x, s.y, area);
	}

}
