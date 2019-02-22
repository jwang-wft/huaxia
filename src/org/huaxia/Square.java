package org.huaxia;

public class Square {
	Point topLeft;
	double side;
	
	Square(Point topLeft, double side){
		this.topLeft = topLeft;
		this.side = side;
	}
	double area() {
		return side * side;
	}
}
