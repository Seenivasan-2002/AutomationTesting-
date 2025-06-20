package week3.day2;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
		System.out.println("Use cash on delivery upto Rs.20000 ");
	}

	@Override
	public void upiPayments() {
		System.out.println("use upi payments upto Rs.30000");
	}

	@Override
	public void cardPayments() {
		System.out.println("use Card paymethods upto Rs.40000");
	}

	@Override
	public void internetBanking() {
		System.out.println("use internet banking upto Rs.100000 ");
	}
	
	public void recordPaymentDetails() {
		System.out.println("Record the all payment details");
	}

}
