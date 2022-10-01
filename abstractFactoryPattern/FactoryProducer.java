package abstractFactoryPattern;

public class FactoryProducer {
	public static AbstractFactory getFactory(boolean rounded){   
	      if(rounded){
	         return new RoundedShapeFactoryVA();         
	      }else{
	         return new ShapeFactoryVA();
	      }
	   }
}
