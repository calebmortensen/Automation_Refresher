import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
//List is a child interface of Collection.
//It is an ordered collection of objects in which duplicate values can be stored.
	
	/*
	 * ArrayList is increased automatically if the collection grows or shrinks if
	 * the objects are removed from the collection. Java ArrayList allows us to
	 * randomly access the list. ArrayList can not be used for primitive types, like
	 * int, char, etc. We need a wrapper class for such cases.
	 */
	public static void main(String[] args) {
		
		List<Integer> li;
		
		//Traditional Arrays
		int[] a = new int[3];
		
		a[0]=5;
		a[1]=6;
		a[2]=9;
		System.out.println(a[0] +" "+ a[1]+" "+ a[2]);
		System.out.println(" ");
		//ArrayList - Re-sizable array
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		li=list;
		
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(9);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(" ");
		//FOR EACH
		for(Integer temp:list) {
			System.out.println(temp);
		}
		
		/*
		 * System.out.println(list.get(0)); System.out.println(list.get(1));
		 * System.out.println(list.get(2)); System.out.println(list.get(3));
		 */
		
		
		
		
		
		
	}

}
