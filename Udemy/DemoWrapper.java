
public class DemoWrapper {

	public static void main(String[] args) {
		
		int a = 9;
		
		Integer obj;  //wrapper
		
		obj = a;
		
		System.out.println(a);  //9
		System.out.println(obj); //9
		
		Integer obj2 = new Integer(3);
		int x;
		
		x = obj2;
		
		System.out.println(obj2);

	}

}
