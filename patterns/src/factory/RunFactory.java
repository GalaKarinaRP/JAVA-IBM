package factory;

public class RunFactory {
	public static void main(String[] args) {
		Payment paymentCard = PaymentFactory.buildPayment(TypePayment.CARD);
		paymentCard.doPayment();
		
		Payment paymentGoo = PaymentFactory.buildPayment(TypePayment.GOOGLEPAYMENT);
		paymentGoo.doPayment();
	}
}
