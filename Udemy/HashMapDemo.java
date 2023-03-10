import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		hmap.put(101, "Caleb");      //key, value
		hmap.put(102, "Mortensen");
		hmap.put(103, "is");
		hmap.put(104, "Awesome");
		
		//System.out.println(hmap.get(103));
		
		for(Integer temp: hmap.keySet()) {
			System.out.println(hmap.get(temp)); //temp by itself just gives keys
		}
	}

}
