package org.huaxia;

public class Square extends AbstractShape {
	private Point topLeft;
	private double side;
	private String type = "Square";

	public Square(Point topLeft, double side) {
		this.topLeft = topLeft;
		this.side = side;
	}

	public double perimeter() {
		return side * 4;
	}

	public double area() {
		return side * side;
	}

	public Point getTopLeft() {
		return topLeft;
	}

	@Override
	public String getType() {
		return type;
	}

	public String toString() {
		return String.format("the area of the square at point %s is %5.2f.", topLeft, area());
	}
}
