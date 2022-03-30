package creationals.builder;

public class Pizza {
	
	private final String sauce;
	private final String cheese;
	private final String baser;
	
	public String getSauce() {
		return sauce;
	}
	
	public String getCheese() {
		return cheese;
	}
	
	public String getBaser() {
		return baser;
	}
	
	@Override
	public String toString() {
		return "Pizza [sauce=" + sauce + ", cheese=" + cheese + ", baser=" + baser + "]";
	}

	public Pizza(PizzaBuilder pizzaBuilder) {
		
		this.sauce = pizzaBuilder.sauce;
		this.cheese = pizzaBuilder.cheese;
		this.baser = pizzaBuilder.baser;
	}
	
	
	public static class PizzaBuilder {
		
		private String sauce;
		private String cheese;
		private String baser;
		
		public PizzaBuilder(String sauce, String cheese, String baser) {			
			this.sauce = sauce;
			this.cheese = cheese;
			this.baser = baser;
		}
		
		public PizzaBuilder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}
		
		public PizzaBuilder cheese(String cheese) {
			this.cheese = cheese;
			return this;
		}
		
		public PizzaBuilder baser(String baser) {
			this.baser = baser;
			return this;
		}
		
		public Pizza build() {
			return new Pizza(this);
			
		}
		
		
	}
	
	
	
	

}
