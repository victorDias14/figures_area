package entities;

public class Triangle {
	
	private Double height;
	private Double base;
	
	public Triangle(Double height, Double base) {
		this.height = height;
		this.base = base;
	}

	public Double area(double height, double base) {
		return height * base;
	}

}
