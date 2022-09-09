package dots.inheritence;

public class Dog extends Animal{
	
	public void bark() {
		System.out.println("dog barks");
		
		}
	public void hunting() {
		 super.hunting();
		  System.out.println("dog im hunting");
	
	}
	
	public static void main(String[] args) {
		
		Dog dg = new Dog();
		dg.colour ="black";
		dg.size =22;
		dg.bark();
		dg.sleep();
		dg.eat();
	    dg.hunting();
		System.out.println(dg.colour);
		System.out.println(dg.size);
		
		Animal an= new Dog();
		an.sleep();
		an.hunting();
		
		
	
		
	}

}
s