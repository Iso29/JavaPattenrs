package Main;

import writeToFileMethods.*;
//import abstractFactoryPattern.AbstractFactory;
//import abstractFactoryPattern.FactoryProducer;
//import builderPattern.Person;
//import factoryPattern.Drawable;
//import factoryPattern.Shape;
//import factoryPattern.ShapeFactory;
//import proxyPattern.Image;
//import proxyPattern.ProxyImage;
//import singleTonePattern.OneTimeCreatable;
//import abstractFactoryPattern.Shape;

public class Main {
	public static void main(String[] args) throws Exception {
		// proxy pattern
//		Image image = new ProxyImage("image 10.jpg");
//		
//		image.display();
//		System.out.println("------");
//		image.display();

		// builder pattern
//		Person.PersonBuilder bld = Person.builder();
//		bld.whatIsPersonName("Ismayil");
//		bld.whatIsPersonsurname("Islamzade");
//		bld.howOldIsPerson(19);
//		bld.whereDoesPersonLive("Yasamal");
//		Person p = bld.buildversion1();	
//		System.out.println(p.getAddress()); 

		// single tone pattern
//		OneTimeCreatable cls = OneTimeCreatable.createOnlyOneTime();

		// factory pattern
//		ShapeFactory shapefactory = new ShapeFactory();
//		Drawable fiqure1 = shapefactory.getShape("circle");
//		fiqure1.drawShape();
//		System.out.println(fiqure1.getPerimetreOfShape());
//		System.out.println(fiqure1.getAreaOfShape());

		// abstract factory pattern
//		AbstractFactory abstractShape = FactoryProducer.getFactory(false);
//		Shape shape1 = abstractShape.getShape("square");
//		shape1.draw();
		
		byte[] data = Methods.readInBytes("isos.jpeg");
		Methods.writeInBytes("isos2.jpeg",data);
		
	}

}
