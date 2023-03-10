import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Reflection API: read values from excel file as String
//and call the appropriate methods having the same names as String text
public class Lion {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		String str = "methodA";
		
		Method m = Lion.class.getMethod(str, Integer.class, Integer.class);
		
		m.invoke(m, 9, 6);
	}
	
	public static void methodA(Integer x, Integer y) {
		System.out.println(x+y);
	}

}
