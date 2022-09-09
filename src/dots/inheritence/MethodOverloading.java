package dots.inheritence;

public class MethodOverloading {
	
	public void method01() {
		  System.out.println("no pram method");
		
	}
	public void method01(int a) {
		  System.out.println("with int param :" + a);
	}
	public void method01(String b) {
		  System.out.println("with String parm : " +b );
	}
	public void method01( String b ,int c) {
		  System.out.println("with String param : " + b  +"" +c );
	}
	
	public void method01( int b, int c) {
		  System.out.println(" with String param :"+b +" "  + c);
	}
	
	 
	public  void clickSearch(String text) {
	}
			
	public void clickSearch(String  category , String text) {
	
	}
	    public void add(int a, int b) {
	    	System.out.println("a+b");
	    		    	
	    }
	    public void sum(int a, int b , int c) {
	    	System.out.println("a+b+c");
        
	}
	    
	    public  static void main(String[ ]args) {
	    	MethodOverloading mol = new MethodOverloading();
	    	mol.add(0,0, 0);
	    	mol.add(0, 0);
	    	mol.method01(2,"text");
	    	mol.method01("name",4);
	    }
	    
}
