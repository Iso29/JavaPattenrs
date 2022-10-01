package factoryPattern;

import java.util.Scanner;

public class Square extends Shape implements Drawable {
	
	double size;

	@Override
	public void drawShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please,enter size of square");
		size = sc.nextDouble();
		System.out.println("Square was drawn");
		
	}

	@Override
	public double getPerimetreOfShape() {
		perimetre = 4*size;
		System.out.println("perimetre of square is :");
		return perimetre;
	}

	@Override
	public double getAreaOfShape() {
		area = size*size;
		System.out.println("area of square is :");
		return area;
	}

}
