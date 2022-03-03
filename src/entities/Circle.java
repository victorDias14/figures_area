package entities;

public class Circle {
	
	private Double radius;

	public Circle(Double radius) {
		this.radius = radius;
	}
	
	public Double perimeter(double radius) {
		return 2 * Math.PI * radius;
	}
	
	public Double area(double radius) {
		return 2 * Math.PI * Math.pow(radius, 2);
	}
	
	public Double diameter(double radius) {
		return radius * 2;
	}

}
