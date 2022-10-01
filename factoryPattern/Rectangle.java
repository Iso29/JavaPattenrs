package factoryPattern;

import java.util.Scanner;

public class Rectangle extends Shape implements Drawable {
	public double width;
	public double length;

	@Override
	public void drawShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter width of rectangle");
		width = sc.nextDouble();
		System.out.println("Please, enter length of rectangle");
		length = sc.nextDouble();
		System.out.println("Rectangle was drawn");
		
	}

	@Override
	public double getPerimetreOfShape() {	
		perimetre = 2*(width+length);
		System.out.println("perimetre of rectangle is :");
		return perimetre;
	}

	@Override
	public double getAreaOfShape() {
		area = (width*length);
		System.out.println("area of rectangle is :");
		return area;
	}

}
