package dots.cg.java;



public class SumWhile {

	public static void main(String[] args) {
	     
	    int sum = 0;
	    int number = 50;

	 
	    System.out.println("Enter a number");
	  
	    while (number >= 0) {
	      
	    sum += number;

	      System.out.println("Enter a number");
	     
	      number -=5;//
	    }
		   
	    System.out.println("Sum = " + sum);
	    
	  }
	

	}


