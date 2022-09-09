package throwsthrows;

import java.io.IOException;

public class ClassB1 {
	
	public void abc() {
		 ClassA1 a1 = new ClassA1();
		 try {
			 a1.name("orange");
			 a1.iOExp("black");
		 }
		 catch (ArithmeticException e) {
			 e.printStackTrace();
		 }
		 catch (IOException e) {
			 e.printStackTrace();
		 }
		 }
	}


