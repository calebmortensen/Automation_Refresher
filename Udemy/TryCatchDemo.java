
public class TryCatchDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Before Exception");
		
		try {
			
			int a = 10/0;  //Arithmetic Exception is output
			//Object, Throwable, Exception, RuntimeException, ArithmeticException
		}catch(ArithmeticException e) {
			System.out.println("Arith Excep is captured and handled");
		}
		System.out.println("After Exception");
	}

}
