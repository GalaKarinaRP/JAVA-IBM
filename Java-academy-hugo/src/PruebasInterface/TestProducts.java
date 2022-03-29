package PruebasInterface;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestProducts{
	
	
	static List<Product> product = new ArrayList<>();
	
	@BeforeAll
	static void beforeClass() throws Exception{
		Collections.addAll(product,
				new Product(1,"coca cola","600 ml", 17) ,
				new Product(2,"pepsi", "2.5 L", 20),
				new Product(3,"fanta", "naranja", 15)
				);
	}

	@Test
    void getChepeastProductTest() {
		List<Product> compare = new ArrayList<>();
		Collections.addAll(compare,
				new Product(1,"coca cola","600 ml", 17) ,				
				new Product(3,"fanta", "naranja", 15)
				);
		
		
		assertEquals(compare, Products.getChepeastProduct(product, 18));
	}
}
