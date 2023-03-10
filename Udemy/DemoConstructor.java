
public class DemoConstructor {

	//Methods have return types but
	//Constructors DON'T have a RETURN TYPE
	
	public static void main(String[] args) {
		
		MyRide toyota = new MyRide("Truck", 40000, 22.9);
				
	}
}
	class MyRide{
		//VARIABLES
		String carModel;
		int cost;
		double mileage;
		
		//Constructor - usually hidden
		public MyRide(String carModel, int cost, double mileage) { //PARAMETERS use 'this'
			System.out.println("Inside Car class constructor");
			
			this.carModel = carModel;
			this.cost = cost;
			this.mileage = mileage;
			
			System.out.println("Car Model: "+carModel);
			System.out.println("Cost: "+cost);
			System.out.println("Mileage: "+mileage);
			
		}
		
		/*
		 * public void carDetails() { System.out.println("Model: "+carModel);
		 * System.out.println("Cost: "+cost); System.out.println("Mileage: "+mileage); }
		 * 
		 * public void startCar() { System.out.println(carModel+" started"); }
		 */
	}



