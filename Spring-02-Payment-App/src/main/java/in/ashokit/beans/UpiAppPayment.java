package in.ashokit.beans;

public class UpiAppPayment implements IPayment {
	
	public UpiAppPayment() {
		System.out.println("Upi App constructor..");
	}

	@Override
	public boolean processPayment() {
		
		System.out.println("Succesful payment by upi App...");
		// TODO Auto-generated method stub
		return true;
	}

}
