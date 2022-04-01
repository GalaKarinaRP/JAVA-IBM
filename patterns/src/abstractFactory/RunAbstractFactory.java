package abstractFactory;

public class RunAbstractFactory {
	
	public static void main(String[] args) {
		AbstractFactory abstractFactoryCard = ProviderFactory.getFactory("Card");
		Card tarjetaVisa = (Card) abstractFactoryCard.create("VISA");
		
		AbstractFactory abstractFactoryPay = ProviderFactory.getFactory("PaymentMethod");
		PaymentMethod paymentDebit = (PaymentMethod) abstractFactoryPay.create("DEBIT");
		
		System.out.println(String.format("Una tarjeta de tipo %s con el metodo de pago %s", tarjetaVisa.getCardType(), paymentDebit.doPayment()));
	}
}
