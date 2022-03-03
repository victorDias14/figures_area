package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Square;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = 9;
		
		while (option != 0) {
			System.out.println("Qual figura deseja calcular?");
			System.out.println("1 - Tri�ngulo");
			System.out.println("2 - Ret�ngulo");
			System.out.println("3 - Quadrado");
			System.out.println("4 - C�rculo");
			System.out.println("0 - Sair");
			option = sc.nextInt();			
			
			if (option == 1) {
				System.out.print("Informe a altura do tri�ngulo: ");
				double height = sc.nextDouble();
				
				System.out.print("Informe a base do tri�ngulo: ");
				double base = sc.nextDouble();
				
				Triangle triangle = new Triangle(height, base);
				
				System.out.println("AREA = " + triangle.area(height, base));
				
			}
			
			else if (option == 2) {
				System.out.print("Informe a altura do ret�ngulo: ");
				double height = sc.nextDouble();
				
				System.out.print("Informe a base do ret�ngulo: ");
				double base = sc.nextDouble();
				
				Rectangle rectangle = new Rectangle (height, base);
				
				System.out.println("AREA = " + rectangle.area(height, base));
				System.out.println("PER�METRO = " +rectangle.perimeter(height, base));

			}
			
			else if (option == 3) {
				System.out.print("Informe o lado do quadrado: ");
				double side = sc.nextDouble();
				
				Square square = new Square(side);
				
				System.out.println("AREA = " + square.area(side));
				System.out.println("PERIMETRO = " + square.perimeter(side));
				
			}
			
			else if (option == 4) {
				System.out.print("Informe o raio do c�rculo: ");
				double radius = sc.nextDouble();
				
				Circle circle = new Circle(radius);
				
				System.out.println("AREA = " + String.format("%.2f", circle.area(radius)));
				System.out.println("PERIMETRO = " + String.format("%.2f",circle.perimeter(radius)));
				System.out.println("DIAMETRO = " + String.format("%.2f",circle.diameter(radius)));
				
			}
			
			else if (option == 0) {
				break;
			}
			
			else {
				System.out.println("Op��o inv�lida");
			}
			System.out.println();
			System.out.println("----------------------------------");
			System.out.println();
		}
	
		sc.close();
	}

}
