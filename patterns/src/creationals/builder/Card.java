package creationals.builder;

public class Card {
	
	private final String cardType;
	private final String name;
	private final String number;
	private final int expire;
	private final boolean isCredit;
	
	
	
	@Override
	public String toString() {
		return "Card [cardType=" + cardType + ", name=" + name + ", number=" + number + ", expire=" + expire
				+ ", isCredit=" + isCredit + "]";
	}

	public String getCardType() {
		return cardType;
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}

	public int getExpire() {
		return expire;
	}

	public boolean isCredit() {
		return isCredit;
	}

	private Card(CardBuilder cardBuilder) {
		this.isCredit = cardBuilder.isCredit;
		this.number = cardBuilder.number;
		this.expire = cardBuilder.expire;
		this.name = cardBuilder.name;
		this.cardType = cardBuilder.cardType;
		
	}
	
	public static class CardBuilder {
		
		private  String cardType;
		private  String name;
		private  String number;
		private  int expire;
		private  boolean isCredit;
		
		public CardBuilder(String cardType, String number) {
			this.cardType = cardType;
			this.number = number;			
		}
		
		public CardBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public CardBuilder expire(int expire) {
			this.expire = expire;
			return this;
		}
		
		public CardBuilder isCredit(boolean isCredit) {
			this.isCredit = isCredit;
			return this;
		}
		
		public Card build() {
			return new Card(this);
			
		}
		
		
	}
}
