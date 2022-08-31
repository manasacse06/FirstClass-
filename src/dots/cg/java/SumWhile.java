package dots.cg.java;

import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
	     
	    int sum = 0;
	    int number = 50;

	    // create an object of Scanner class
	    //Scanner input = new Scanner(System.in);

	    // take integer input from the user
	    System.out.println("Enter a number");
	   // int number = input.nextInt();
		   
	    // while loop continues 
	    // until entered number is positive
	    while (number >= 0) {
	      // add only positive numbers
	      sum += number;

	      System.out.println("Enter a number");
	      //number = input.nextInt();
	      number -=5;//
	    }
		   
	    System.out.println("Sum = " + sum);
	    //input.close();
	  }
	

	}


