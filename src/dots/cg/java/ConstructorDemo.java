package dots.cg.java;

public class ConstructorDemo {
	
	 public ConstructorDemo() {
	 
		 System.out.println ("im in the no-argument Constructor");
	 }

	 
	 public ConstructorDemo( int a,int b) {
		 System.out.println ("im in the argument Constructor");
	   
	 }

	public static void main(String[] args) {
		
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(3,4);
		
		

	}

}
