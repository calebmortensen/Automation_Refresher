
public class DemoArrays {

	
	//Primitive: int, char, double, long, boolean, short, byte, float (NON OBJECT)
	//non-primitive: string, array (OBJECT TYPE)
	
	public static void main(String[] args) {
		//single dimensional
		char[] c;
		int[] a = {5,6,7,26,66,43,19}; //holds Values
		int[] b = new int[3]; //holds LENGTH
		int[][] x = {{5,6,7},{66,43,19}}; 
		b[0] = 4;
		b[1] = 7;
		b[2] = 9;
		
		System.out.println("First value: "+b[0]);
		System.out.println("Second value: "+b[1]);
		System.out.println("Third value: "+b[2]);
		System.out.println("Memory is: " +b); //gives Memory location i think ?
		
		System.out.println("Length is: "+a.length);
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
			
		}
		System.out.println();
				//FOR EACH LOOP
		for(int temp:a) {
			System.out.println(temp);
			
		}
		System.out.println("Moving on");
		//double dimensional
		int[][] d = new int[2][3]; //holds length value  2 ROWS & 3 COLUMNS

		d[0][0] = 6;
		d[0][1] = 8;
		d[0][2] = 10;
		
		d[1][0] = 5;
		d[1][1] = 7;
		d[1][2] = 9;
		
		
		System.out.println(d[0][0]);
		System.out.println(d[0][1]);
		System.out.println(d[0][2]);
		System.out.println(d[1][0]);
		System.out.println(d[1][1]);
		System.out.println(d[1][2]);
		System.out.println();
		
		System.out.println(x.length); //2 arrays
		System.out.println(x[0].length); //3 values
		System.out.println(x[1].length); //3 values
		System.out.println();
		
		//int[][] x = {{5,6,7},{66,43,19}};
		//This is like Inception
		for(int j=0; j<x.length; j++ ) {    //length is 2... being 0 and 1
			
			for(int k=0; k<x[0].length; k++) {
				
				System.out.println(x[j][k]);
			}
		}
	}

}
