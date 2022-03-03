package entities;

public class Square{
	
	private Double side;

	public Square(Double side) {
		this.side = side;
	}
	
	public Double area(double side) {
		return Math.pow(side, 2);
	}
	
	public Double perimeter(double side) {
		return side * 4;
	}

}
