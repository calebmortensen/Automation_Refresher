import java.util.HashSet;

public class HashDemo {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<String>();

		
		hset.add("My ");
		hset.add("name  ");
		hset.add("is  ");
		hset.add("Caleb ");
		
		//no index in HASH so Can't use For loop to get correct order
		
		for(String temp:hset) {
			System.out.println(temp);
		}
		
	}

}
