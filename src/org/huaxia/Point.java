package org.huaxia;

public class Point {
	double x;
	double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("(%3.1f, %3.1f)", x, y);
	}
}
