package abstractFactory;

public class MasterCard implements Card{

	@Override
	public String getCardNumber() {
		// TODO Auto-generated method stub
		return "444 777 454";
	}

	@Override
	public String getCardType() {
		// TODO Auto-generated method stub
		return "MASTERCARD";
	}

}
