package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactoy {

	public static class CardType{
		public static final String VISA = "visa";
		public static final String AMEX = "amex";
	}
	
	public static Map<String, PrototypeCard> prototypes = new HashMap<>();
	
	public static PrototypeCard getInstance(final String type) throws CloneNotSupportedException{
		return prototypes.get(type).clone();
	}
	
	public static void loadCards() {
		Visa visa = new Visa();
		visa.setName("Esta es una tarjeta visa");
		prototypes.put(CardType.VISA, visa);
	
		Amex amex = new Amex();
		amex.setName("Esta es una tarjeta Amex");
		prototypes.put(CardType.AMEX, amex);
	
	}
	
	
}
