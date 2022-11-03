package nestedClasses2;

public class Client {

	public static void main(String[] args) {
		
		// StaticField (class level)
		//System.out.println(OuterClass.staticFields);
		
		// Non-static field (instance level)
		//OuterClass outerClass = new OuterClass();
		
		//System.out.println(outerClass.instanceField);
		
		//OuterClass outerClass2 = new OuterClass();
		
		//outerClass.staticFields++;
		
		//System.out.println(outerClass.staticFields);
		

		//outerClass2.staticFields++;
		
		//System.out.println(outerClass2.staticFields);
		
		//OuterClass.staticFields++;
		//System.out.println(OuterClass.staticFields);
		
		OuterClass outerClass = new OuterClass();
		
		OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
		
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		
		
		
		
		
	}

}
