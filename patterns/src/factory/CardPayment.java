package factory;

public class CardPayment implements Payment{

	@Override
	public void doPayment() {
		System.out.println("pagando con google payment");
		
	}

}
