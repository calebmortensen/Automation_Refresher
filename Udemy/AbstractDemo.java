
public abstract class AbstractDemo {
//Notice 'abstract class' but in 'interface', there's no 'class' used
	// Methods have partial bodies
	public abstract void startCar();

	public void stopCar() {
		System.out.println("Car Stopped");
	}

}

abstract class Sub extends AbstractDemo {
// this is a CLASS
	
	  public void startCar() { System.out.println("Car started in Sub");
	  
	  }
	  
	 
}

class XYZ extends Sub {

	public void startCar() {
	}
}