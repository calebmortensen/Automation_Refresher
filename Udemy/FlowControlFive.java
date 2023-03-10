
public class FlowControlFive {

	public static void main(String[] args) {
		// while condition evaluated first (But in a DO WHILE, the condition is evaluated after)
		//FOR LOOP is only different because you know the # of iterations in advance
		
		
		for(int i=0; i<3; i++) {
			System.out.println("Value of i is: "+i);
			
		}
		
	
	
	for(int a=0; a<8; a++) {
		if(a==3) {
			//break;  // will stop once condition met
			continue; //will SKIP the current value and proceed
		}
		System.out.println("Value of a is: "+a);
	}
	
	
}
}