package PruebasInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class FunctionalInterface {

	public static void main(String[] args) {
	
	List<Item> items = new ArrayList<>();
	
	Collections.addAll(items,
			
			new Item("Samsung",40),
			new Item("Xiaomi",15),
			new Item("Iphone", 30)
			);
	
	Function<String, String> toUpper = str -> str.toUpperCase();
	System.out.println(toUpper.apply("academy"));
	
	// DOS ARGUMENTOS Y EL RESULTADO		
	BiFunction<String, String, String> concat = (str1, str2 ) -> str1 + " " + str2;
	System.out.println( concat.apply("Java", "Academy"));
	
	
	//------------------------------------------------------------------
	
	List<String> itmNams = items.stream().map(Item::getName).collect(Collectors.toList());
	
	itmNams.forEach(System.out::println);		
	
	/*
	for(String nam: itmNams) {
		System.out.println(nam);
		
	}
	*/	

	//---------------------------------------------------------------
	

	List<Offer> offers  = items.stream().map(i -> i.getPrice() < 40 ?  new Offer(i, 5) : new Offer(i, 10)			
	).collect(Collectors.toList());
	
	offers.forEach(o -> System.out.println(o));
	
	/*
	for(Offer ofr: offers) {
		System.out.println(ofr);			
	}
	*/
	
	//---------------------------------------------------------------
	//SUPPLIER
	
	Supplier<Integer> supInt = () -> new Random().nextInt(10);
	System.out.println(supInt.get());
	
	Supplier<IntStream> mulInt = () -> new Random().ints(10,0,10).distinct();
	Stream.generate(mulInt).findFirst().get().forEach(System.out::println);

	//---------------------------------------------------------------
	
	Predicate<Item> filterByPrice = i -> i.getPrice() < 20;
	for (Item i: items) {
		if( filterByPrice.test(i)) {
			System.out.println(i);				
		}			
	}
	
	items.stream().filter( i -> i.getPrice() < 31).collect(Collectors.toList()).forEach(System.out::println);

	//---------------------------------------------------------------
	
	}
	
}

class Offer{
	
	private Item item;
	private int disc;
	
	@Override
	public String toString() {
		return "Offer [item=" + item + ", disc=" + disc + "]";
	}

	public Offer(Item item, int disc) {
		this.item = item;
		this.disc = disc;
	}
		
}

class Item{
	
	private String name;
	private int  price;
	
	public String getName() {
		return name;
	}	

	public int getPrice() {
		return price;
	}

	public Item(String name, int price) {		
		this.name = name;
		this.price = price;
	}
	
	@Override
	 public String toString() {
	  return "Item [name=" + name + ", price=" + price + "]";
	 }
	
	
}


