package creationals.builder;

public class RunBuilder {

	public static void main(String[] args) {
		
		Card visa = new Card.CardBuilder("VISA","12345")
				.name("Gabriel Castillo")
				.isCredit(false)
				.build();
		
		System.out.println(visa);
		
		Card amex = new Card.CardBuilder("AMEX","234234112")				
				.build();
		
		System.out.println(amex);
	}
}
