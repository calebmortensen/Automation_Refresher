
public interface InterFaceDemo {
	//Notice 'abstract class' but in 'interface', there's no 'class' used
	// ALL methods in an 'interface' must be EMPTY
	
	String Account1 = "Savings";  //static & final by DEFAULT in interface
	String Account2 = "Current";
	
	public void viewBalance();
	public void transferAmount();
	public void openAccount();
	
}	
//IMPLEMENTS

class xyy implements InterFaceDemo{

	@Override
	public void viewBalance() {
		System.out.println("test");
		
	}

	@Override
	public void transferAmount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		
		
		System.out.println(InterFaceDemo.Account1);
		
		xyy xd = new xyy();
		xd.transferAmount();
	}
	
}