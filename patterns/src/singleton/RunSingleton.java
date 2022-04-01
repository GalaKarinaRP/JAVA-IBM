package singleton;

public class RunSingleton {
	
	public static void main(String[] args) {
		
		Card.getINSTANCE().setCardNumber("000 111 222");
		  
		  System.out.println(Card.getINSTANCE().getCardNumber());
	}
}
