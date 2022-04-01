package prototype;

public class RunPrototype {

	
	public static void main(String[] args) {
		PrototypeFactoy.loadCards();
		try {
			PrototypeCard visa = PrototypeFactoy.getInstance(PrototypeFactoy.CardType.VISA);
			visa.getCard();
			
			PrototypeCard amex = PrototypeFactoy.getInstance(PrototypeFactoy.CardType.AMEX);
			amex.getCard();
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
			
		}
	}
}
