package dots.cg.java;

public class Variables {
	 
	 String colour = "blue";
	 
	  static int age = 30;
	  
	 public static void main(String [] args) {
		 
		  Variables  vb = new Variables();
		  /*
		  System.out.println(vb.colour);
		  
		  System.out.println(new Variables().colour);
		  
		  
		   vb.colour ="red";
		   System.out.println(vb.colour);
		   
		   Variables vx = new Variables();
		   System.out.println(vx.colour);
		   
		   vx.colour = "Orange";   
		    System.out.println(vx.colour);
	 
		  // System.out.println(age);//Static 
		   * 
		   */
		  
		  vb.age =45;
		  System.out.println(vb.age);
		  System.out.println(age);
	  }
	 
	 public void localVariable() {
		 
		 int x =20;//local variable
		 System.out.println(x); 
	 }

}


