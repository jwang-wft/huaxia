package org.huaxia;

public class Square {
	private Point topLeft;
	private double side;
	
	public Square(Point topLeft, double side){
		this.topLeft = topLeft;
		this.side = side;
	}
	public double area() {
		return side * side;
	}
	public Point getTopLeft() {
		return topLeft;
	}
	
}
