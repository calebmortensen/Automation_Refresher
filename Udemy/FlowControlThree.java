
public class FlowControlThree {

	public static void main(String[] args) {
		
		int i =6;
		// condition evaluated first (But in a DO WHILE, the condition is evaluated after)
		while(i < 7) {
			System.out.println("The value of i is " +i);
			i++; //runs forever without this statement
			System.out.println(i);
		} 

	}

}
