package estructurales.adapter;

public class RunAdapter {
	
	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard();
		creditCard.pay("classic");
		creditCard.pay("gold");
		creditCard.pay("black");
		creditCard.pay("silver");
		
	}

}
