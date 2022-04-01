package factory;

public class PaymentFactory {

	public static Payment buildPayment(TypePayment typePayment) {
		switch (typePayment) {
		case CARD:
			return new CardPayment();
		case GOOGLEPAYMENT:
			return new GooglePayment();		
		default:
			return new CardPayment();
					
		}	
	}
	
}
