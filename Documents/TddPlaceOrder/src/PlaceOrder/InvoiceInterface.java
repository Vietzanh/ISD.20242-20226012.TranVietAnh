package PlaceOrder;

public interface InvoiceInterface {
	String createInvoice(Object... operands);
	String getInvoice(Integer invoice_id);
}
