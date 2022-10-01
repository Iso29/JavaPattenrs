package factoryPattern;

import java.util.Scanner;

public class Circle extends Shape implements Drawable{
	
	public double radious;

	@Override
	public void drawShape() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please, enter radious of circle");
	    radious = sc.nextDouble();
		System.out.println("circle was drawn");
		
	}

	@Override
	public double getAreaOfShape() {
		area =((3.14*radious*radious)/2);
		System.out.println("area of circle is :");
		return area;
	}

	@Override
	public double getPerimetreOfShape() {
		perimetre= (2*3.14*radious);
		System.out.println("perimetre of circle is :");
		return perimetre;
	}
}
