package PruebasInterface;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ProductTest {
	
	static List<Product> product = new ArrayList<>();
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Collections.addAll(product,
				new Product(1,"coca cola","600 ml", 17) ,
				new Product(2,"pepsi", "2.5 L", 20),
				new Product(3,"fanta", "naranja", 15)
				);
	}
	
	@Test
    void getChepeastProductTest() {
	 List<Integer> price= new ArrayList<>();
	 Collections.addAll(price, 17,15 );   
     assertEquals(price, Products.getChepeastProduct(product, 18));
	}
	
	@Test
    void getExpensiveProductTest() {
	 List<Integer> price= new ArrayList<>();
	 Collections.addAll(price, 20 );   
     assertEquals(price, Products.getExpensiveProduct(product, 20));
	}
	
	@Test
    void getProductByOrderTest() {
	 List<String> names= new ArrayList<>();
	 Collections.addAll(names, "coca cola", "fanta", "pepsi"  );   
     assertEquals(names, Products.getProductByOrder(product));
	}
	
	@Test
	void getProductByIdTest() {
		assertEquals(product.get(2), Products.getProductById(product, 3));
	}
	
	@Test
    void getProductExampleTest() {
	 List<Product> names= new ArrayList<>();
	 Collections.addAll(names,
				new Product(1,"coca cola","600 ml", 17) ,				
				new Product(3,"fanta", "naranja", 15)
				);
	 assertEquals(names, Products.getProductExample(product, 18));
	}	

}
