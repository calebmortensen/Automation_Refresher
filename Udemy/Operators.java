
public class Operators {

	public static void main(String[] args) {
		System.out.println(true && true); //true    AND
		System.out.println(true && false); //false   
		System.out.println(false || true); //true   OR
		System.out.println(false || false); //false
		int a = 1;
		int b = 2;
		int c = 3;
		int d;
		System.out.println(a == 5); //false  Relational Operators
		System.out.println(a != b); //true          NOT
		System.out.println(a > b); //false
		
		a+=4;
		System.out.println(a);
		
		d = b>c ? 6 : 9;
		System.out.println(d);
	}

}
