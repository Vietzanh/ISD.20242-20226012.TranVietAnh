package PlaceOrder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvoiceTest {
	private Invoice classUnderTest;

	@BeforeEach
	void setUp() throws Exception {
		classUnderTest = new Invoice();
	}

	@Test
	void testCreateInvoice() {
//		invoice_id, order_id, amount, tax, subtotal
		Object[] invoice = {1, 2, 100f, 10f, 50f, 100};
		assertEquals("INVALID", classUnderTest.createInvoice(invoice));
		
		invoice = new Object[] {"not integer", 2, 100f, 10f, 50f};
		assertEquals("INVALID invoice_id", classUnderTest.createInvoice(invoice));
		invoice = new Object[] {0, 2, 100f, 10f, 50f};
		assertEquals("INVALID invoice_id", classUnderTest.createInvoice(invoice));
		
		invoice = new Object[] {1, "not integer", 100f, 10f, 50f};
		assertEquals("INVALID order_id", classUnderTest.createInvoice(invoice));
		invoice = new Object[] {1, 0, 100f, 10f, 50f};
		assertEquals("INVALID order_id", classUnderTest.createInvoice(invoice));
		
		invoice = new Object[] {1, 2, "not float", 10f, 50f};
		assertEquals("INVALID amount", classUnderTest.createInvoice(invoice));
		invoice = new Object[] {1, 2, 0f, 10f, 50f};
		assertEquals("INVALID amount", classUnderTest.createInvoice(invoice));

		invoice = new Object[] {1, 2, 100f, "not float", 50f};
		assertEquals("INVALID tax", classUnderTest.createInvoice(invoice));
		invoice = new Object[] {1, 2, 100f, 0f, 50f};
		assertEquals("INVALID tax", classUnderTest.createInvoice(invoice));
		
		invoice = new Object[] {1, 2, 100f, 10f, "not float"};
		assertEquals("INVALID subtotal", classUnderTest.createInvoice(invoice));
		invoice = new Object[] {1, 2, 100f, 10f, 0f};
		assertEquals("INVALID subtotal", classUnderTest.createInvoice(invoice));
	}

	@Test
	void testGetInvoice() {
		
	}
}
