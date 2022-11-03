package nestedClasses2;

public class OuterClass {
	
	static int staticFields = 0; // static, class-level..One staticFields variable shared amongst all instances of OuterClass
	
	public int instanceField; // Instance level - each instance of outer-class gets its own instanceField 
	
	
	public OuterClass() {
		instanceField = 1;
		System.out.println("Hello from OuterClass constructor");
	}
	
	
	public static class StaticNestedClass{
		// Nested classes are members of the enclosing class such as Attributes and Methods 
		// Static nested classes can access static members of the enclosing class 
		// Static nested classes ARE NOT ASSOCIATED WITH AN INSTANCE OF THE ENCLOSING CLASS
		// We canno't access instance members of the OuterClass
		
		// Inner static class 
		public StaticNestedClass() {
			System.out.println("Hello from StaticNestedClass constructor");
			
			System.out.println(staticFields);
		}
		
	}
	
	
	// Inner Non-Static Class
	
	public class InnerClass{
		// Inner Classes ARE ASSOCIATED WITH AN INSTANCE OF THE ENCLOSING CLASS (OuterClass)
		// Inner classes can access static and non static members of the enclosing class 
		
		// Instance level field
		public int instanceField;
		
		public InnerClass() {
			instanceField = 100;
			System.out.println("Hello from innerclass constructor");
			System.out.println("Static Fields: " + staticFields);
			System.out.println("Instance Fields: " + this.instanceField);
			
			// OuterClass.this refers to this instance of OuterClass that 
			// this instance of InnerClass belongs too
			
			System.out.println("OuterClass's instance field: " + OuterClass.this.instanceField);
		}
		
		
	}

}
