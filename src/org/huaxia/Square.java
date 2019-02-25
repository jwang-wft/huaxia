package org.huaxia;

public class Square implements Shape{
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
	
	public String toString() {
		return String.format("the area of the square at point %s is %5.2f.", topLeft, area());
	}
}
