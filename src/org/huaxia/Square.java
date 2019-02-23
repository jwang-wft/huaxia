package org.huaxia;

public class Square {
	public Point topLeft;
	double side;
	
	public Square(Point topLeft, double side){
		this.topLeft = topLeft;
		this.side = side;
	}
	public double area() {
		return side * side;
	}
}
