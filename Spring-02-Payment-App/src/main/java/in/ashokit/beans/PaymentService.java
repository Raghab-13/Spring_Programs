package in.ashokit.beans;

public class PaymentService {
	
	private IPayment payment;
	
	public PaymentService(IPayment payment) {
		
		this.payment=payment;
	}
	
//	public void setPayment(IPayment payment) {
//		this.payment=payment;
//	}
	
	public void doPayment(double billAmt) {
		boolean status=payment.processPayment();
		if(status) {
			System.out.println("printing receipt of 430rs");
		}else {
			System.out.println("payment declined");
		}
	}
}
