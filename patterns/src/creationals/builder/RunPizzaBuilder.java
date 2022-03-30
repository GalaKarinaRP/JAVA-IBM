package creationals.builder;

public class RunPizzaBuilder {

	public static void main(String[] args) {
		
		Pizza pizzaPeperoni = new Pizza.PizzaBuilder("tomato with mushrooms", "motzarella", "peperonni")
				.build();
		
		System.out.println(pizzaPeperoni);
		
		Pizza hawaiana = new Pizza.PizzaBuilder("tomato", "motzarella cream manchego", "pineapple jam")
				.build();
		
		System.out.println(hawaiana);
	}
}
