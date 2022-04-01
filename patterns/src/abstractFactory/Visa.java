package abstractFactory;

public class Visa implements Card {

	@Override
	public String getCardNumber() {
		return "333 555 666";
	}

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return "VISA";
	}

}
