package org.huaxia;

public class ShapeTester {

	public static void main(String[] args) {
		Square s = new Square();
		s.x = 1.0;
		s.y = 1.0;
		s.side = 5;
		double area = s.side * s.side;
		System.out.printf("the area of the square is %5.2f\n", area);
	}

}
