
public class StoringData {
	
		//Instance variable
		static int x = 7;

	public static void main(String[] args) {
		//Local variable
		int a = 5;
		int t = 1;
		double b = 7.75;
		char c = '$';
		boolean d = true;
		String e = "This is a string";
		
			
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(b/a);
		System.out.println("Modulus aka Remainder " + b%a);
		System.out.println(b*a);
		
		//increment operator
		a++;
		System.out.println(a);
		b--;
		b--;
		System.out.println(b);
		whatever();
		System.out.println(t++);
		System.out.println(++t);
	}

	public static void whatever() {
		//Local variable
		//int a = 4;
		//System.out.println(a);
		//System.out.println(x);
		System.out.println("Whatever");

	}

}
