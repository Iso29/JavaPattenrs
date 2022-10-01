package singleTonePattern;

public class OneTimeCreatable {
	private OneTimeCreatable() {
		
	}
	
	private static OneTimeCreatable cls = null;
	
	public static OneTimeCreatable createOnlyOneTime() {
		if(cls==null) {
			return new OneTimeCreatable();
		}
		return cls;
	}
}
