package org.huaxia;

public class Rectangle extends AbstractShape{
	private Point topLeft;
	private double height;
	private double width;
	private String type = "Rectangle";
	
	public Rectangle(Point topLeft, double height, double width) {
		this.topLeft = topLeft;
		this.height = height;
		this.width = width;
	}
	
	public double perimeter() {
		return (height+ width) * 2.0;
	}
	
	public double area() {
		return height * width;
	}
	
	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}
	public Point getTopLeft() {
		return topLeft;
	}
	
	@Override
	public String getType() {
		return type;
	}

	public String toString() {
		return String.format("the area of the rectangle at point %s is %5.2f.", topLeft, area());
	}
	
}
