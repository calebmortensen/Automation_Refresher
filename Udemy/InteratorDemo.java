import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class InteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		alist.add(5);
		alist.add(9);
		alist.add(3);
		alist.add(6);
		
		
		Iterator itr = alist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*
		 * for(Integer temp: alist) { System.out.println(temp); }
		 */
		
		HashSet<String> hset = new HashSet<String>();
		hset.add("Caleb ");
		hset.add("is ");
		hset.add("Super ");
		hset.add("Awesome ");
		
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		/*
		 * for(String temp: hset) { System.out.println(hset); }
		 */
	}

}
