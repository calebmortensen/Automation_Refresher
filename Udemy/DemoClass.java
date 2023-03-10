
public class DemoClass {

	public static void main(String[] args) {
		
		Car toyota = new Car();
		Car audi = new Car();
		Car ford = new Car();

		toyota.model = "Tacoma";
		toyota.cost = 45000;
		toyota.color = "black";
		
		audi.model = "Z";
		audi.cost = 12000;
		audi.color = "Red";
		
		ford.model = "F";
		ford.cost = 52000;
		ford.color = "Green";
		
		toyota.startCar();
		toyota.stopCar();
		toyota.carDetails();
		
		audi.startCar();
		audi.stopCar();
		audi.carDetails();
		
		ford.startCar();
		ford.stopCar();
		ford.carDetails();
	}

}

class Car {
	
	String model;
	int cost;
	String color;
	
	public void startCar() {
		System.out.println(model+ " started");
	}
	
	public void stopCar() {
		System.out.println(model+ " stopped");
	}
	
	public void carDetails() {
		System.out.println("The model of the car is "+model);
		System.out.println("The cost of the car is "+cost);
		System.out.println("The color of the car is "+color);
	}
}
