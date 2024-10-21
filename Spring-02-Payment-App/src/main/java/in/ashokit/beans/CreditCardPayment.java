package in.ashokit.beans;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		System.out.println("credit card cunstructor....");
	}

	@Override
	public boolean processPayment() {
		// TODO Auto-generated method stub
		System.out.println("payment successful by credit card....");
		return true;
	}

}
