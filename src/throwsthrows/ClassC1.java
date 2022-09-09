package throwsthrows;

import java.io.IOException;

public class ClassC1 {
	public static void main(String[] lovely) {
		
		ClassA1 a1 = new ClassA1();
		
		try {
      		a1.name("blue");
		}
		catch (IOException e) {
			System.out.println("caught the exception");
			e.printStackTrace();
		}
		
		}

}
