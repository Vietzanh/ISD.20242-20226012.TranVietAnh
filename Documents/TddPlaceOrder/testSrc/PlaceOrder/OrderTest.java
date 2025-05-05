package PlaceOrder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTest {
	private Order classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		
		classUnderTest = new Order();
	}

	@Test
	void testCreateOrder() {
//		order_id, customer_id, total_amount, payment_method, order_status, subtotal, tax
		Object[] order = {1, 2, 10f, "VNPay", "Pending", 10f, 10f, 1};
		assertEquals("INVALID", classUnderTest.createOrder(order));
		
		order = new Object[] {"wrong order_id", 2, 10f, "VNPay", "Pending", 10f, 10f};
		assertEquals("INVALID order_id", classUnderTest.createOrder(order));
		
		order = new Object[] {1, "wrong customer_id", 10f, "VNPay", "Pending", 10f, 10f};
		assertEquals("INVALID customer_id", classUnderTest.createOrder(order));
		
		order = new Object[] {1, 2, -10f, "VNPay", "Pending", 10f, 10f};
		assertEquals("INVALID total_amount", classUnderTest.createOrder(order));
		
		order = new Object[] {1, 2, 10f, "VNPay@", "Pending", 10f, 10f};
		assertEquals("INVALID payment_method", classUnderTest.createOrder(order));
		
		order = new Object[] {1, 2, 10f, "VNPay", "Pending@", 10f, 10f};
		assertEquals("INVALID order_status", classUnderTest.createOrder(order));
		
		order = new Object[] {1, 2, 10f, "VNPay", "Pending", -10f, 10f};
		assertEquals("INVALID subtotal", classUnderTest.createOrder(order));
		
		order = new Object[] {1, 2, 10f, "VNPay", "Pendinga", 10f, -10f};
		assertEquals("INVALID tax", classUnderTest.createOrder(order));
		
		order = new Object[] {1, 2, 10f, "VNPay", "Pendinga", 10f, 10f};
		assertEquals("Order created", classUnderTest.createOrder(order));
	}
	
	@Test
	void testGetOrder() {
		assertEquals("INVALID", classUnderTest.getOrder(-10));
		assertEquals("Order returned", classUnderTest.getOrder(10));
	}

}
