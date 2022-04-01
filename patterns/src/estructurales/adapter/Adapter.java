package estructurales.adapter;

public class Adapter implements Payment {
	
	Secure secureCreditCard;
	
	public Adapter(String type) {
		
		if("black".equals(type)) {
			secureCreditCard = new BlackCreditCard();
		}else if("gold".equals(type)) {
			secureCreditCard = new GoldenCreditCard();
		}
	}
	

	@Override
	public void pay(String type) {
		
		if("black".equals(type)) {
			secureCreditCard.payWithSecureLevelA();
		}else if("gold".equals(type)) {
			secureCreditCard.payWithSecureLevelz();
		}
	}

}
