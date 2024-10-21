package in.ashokit.beans;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment() {
		System.out.println("debit card cunstructor....");
	}

	@Override
	public boolean processPayment() {
		System.out.println("payment successful by debit card....");
		
		return true;
	}

}
