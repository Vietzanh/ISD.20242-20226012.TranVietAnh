package PlaceOrder;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartTest {
	private Cart classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new Cart();
	}

	@Test
	void testCheclItemsAvailability() {
		List<Integer> items = Arrays.asList(1, 2, 3);
		List<Integer> numbers = Arrays.asList(10, 20);
		assertEquals("INVALID", classUnderTest.checkItemsAvailability(items, numbers));
		
		items = Arrays.asList(-1, 2);
		numbers = Arrays.asList(10, 20);
		assertEquals("INVALID", classUnderTest.checkItemsAvailability(items,  numbers));
		
		items = Arrays.asList(1, 2);
		numbers = Arrays.asList(-10, 20);
		assertEquals("INVALID", classUnderTest.checkItemsAvailability(items,  numbers));
		
		items = Arrays.asList(1, 2);
		numbers = Arrays.asList(0, 10);
		assertEquals("False", classUnderTest.checkItemsAvailability(items, numbers));
		
		items = Arrays.asList(1, 2);
		numbers = Arrays.asList(10, 20);
		assertEquals("True", classUnderTest.checkItemsAvailability(items,  numbers));
	}
	
	@Test
	void testCalculatePrice() {
		List<Integer> items = Arrays.asList(1, 2, 3);
		List<Float> prices = Arrays.asList(10f, 20f);
		assertEquals("INVALID", classUnderTest.calculatePrice(items,  prices));
		
		items = Arrays.asList(0, 2);
		prices = Arrays.asList(10f, 20f);
		assertEquals("INVALID", classUnderTest.calculatePrice(items,  prices));
		
		items = Arrays.asList(1, 2);
		prices = Arrays.asList(-10f, 20f);
		assertEquals("INVALID", classUnderTest.calculatePrice(items, prices));
		
		items = Arrays.asList(1, 2);
		prices = Arrays.asList(10f, 20f);
		assertTrue(classUnderTest.calculatePrice(items, prices).matches("^\\d+(\\.\\d+)?$"));
	}

}
