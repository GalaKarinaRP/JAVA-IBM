package PruebasInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Products {
	
	public static void main(String[] args) {
		
		List<Product> product = new ArrayList<>();
		
		Collections.addAll(product,
				new Product(1,"coca cola","600 ml", 21) ,
				new Product(2,"pepsi", "2.5 L", 20),
				new Product(3,"fanta", "naranja", 15)
				);
		System.out.println("-------------- CHEPEAST PRODUCT BY PRICE---------------------------");
		//System.out.println(getChepeastProduct(product, 18));
		
		System.out.println("-------------- EXPENSIVE PRODUCT BY PRICE--------------------------");
		getExpensiveProduct(product, 18);
		
		System.out.println("-------------- ORDER PRODUCT------------------------------");
		getProductByOrder(product);
		
		System.out.println("-------------- GET PRODUCT BY ID------------------------------");
		getProductById(product, 3);
	}

	
	public static List<Integer> getChepeastProduct(List<Product> products, int price) {	    
	  return products.stream().map(i -> i.getPrice()).filter(n -> n <= price).collect(Collectors.toList());
	}
	
	public static List<Integer> getExpensiveProduct(List<Product> products, int price) {
		return products.stream().map(i ->i.getPrice()).filter(n -> n >= price).collect(Collectors.toList());
	}
	
	public static List<String> getProductByOrder(List<Product> products) {
		return products.stream().map(i -> i.getName()).sorted().collect(Collectors.toList());
	}
	
	public static Product getProductById(List<Product> products, int id) {
		return products.stream().filter(i ->i.getId() == id).findFirst().get();
	}

}

class Product{
	
	private int id;
	private String name;
	private String description;
	private int  price;
	
	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	
	public String getName() {
		return name;
	}	

	public int getPrice() {
		return price;
	}

	
	
	public Product(int id, String name, String description, int price) {		
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	
	
	
}

