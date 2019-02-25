package org.huaxia;

public class Rectangle implements Shape{
	private Point topLeft;
	private double height;
	private double width;
	
	public Rectangle(Point topLeft, double height, double width) {
		this.topLeft = topLeft;
		this.height = height;
		this.width = width;
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
	
}
