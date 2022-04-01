package singleton;

import java.io.Serializable;

public class Card implements Serializable{
	private static final long serialVersionUID = 1L;
	private static Card INSTANCE;
	private String cardNumber;
	
	private Card(){
		
	}
	
	public synchronized static Card getINSTANCE() {
		if(INSTANCE == null) {
			INSTANCE = new Card();
		}
		
		return INSTANCE;
	}
	
	//Si la clase implementa Serializable se debe poner este metodo
	private Object readResolve() {
		return INSTANCE;
	}
	
	
	public String getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}

