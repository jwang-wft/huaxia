package org.huaxia;

public class Triangle extends AbstractShape{

	private double side1;
	private double side2;
	private double side3;
	private double alphaInDegree;
	private Point topLeft;
	private String type = "Triangle";
	
	public Triangle(double side1, double side2, double alphaInDegree, Point topLeft) {
		this.side1 = side1;
		this.side2 = side2;
		this.alphaInDegree = alphaInDegree;
		this.topLeft = topLeft;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	@Override
	public double area() {
//		double alpha = alphaInDegree * Math.PI/180;
//		return side1*side2*Math.sin(alpha)/2.0;
		double s = (side1 + side2 + side3) / 2.0;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

	public Point getTopLeft() {
		return topLeft;
	}
	
	@Override
	public String getType() {
		return type;
	}

	public String toString() {
		return String.format("the area of the triangle (side1=%5.2f; side2=%5.2f; angle=%5.2f) is %5.2f.", side1, side2, alphaInDegree, area());
		
	}

}
