package entities;

public class Rectangle {
	
	private Double height;
	private Double base;
	
	public Rectangle(Double height, Double base) {
		this.height = height;
		this.base = base;
	}
	
	public Double area(double height, double base) {
		return height * base;
	}
	
	public Double perimeter(double height, double base) {
		return (height + base) * 2;
	}
	
}
