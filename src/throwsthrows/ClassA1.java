package throwsthrows;
import java.io.IOException;
public class ClassA1 {
	
	public void name(String clr)throws ArithmeticException {
		
		System.out.println("im going to throw throw an...");
		System.out.println("im a hero");	
		if (clr != "red")
	       throw new ArithmeticException();
		else
			System.out.println("the color is vaild :" +clr);
		
		System.out.println("im finally free");
		
	}
	public void iOExp(String clr) throws IOException {
		
		System.out.println("im going to throw throw an...");
		System.out.println("im a hero");
		
		if (clr != "red")
	       throw new IOException();
		else
			System.out.println("the color is vaild :" +clr);
		
		System.out.println("im finally free");
	}
	public void fileNotFound(String clr) throws  InterruptedException{
	}


		
	}

