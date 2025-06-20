package week3.day2;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		Amazon pay = new Amazon();
		
		pay.upiPayments();
		pay.cardPayments();
		pay.cashOnDelivery();
		pay.internetBanking();
		pay.recordPaymentDetails();
		
	}

}
