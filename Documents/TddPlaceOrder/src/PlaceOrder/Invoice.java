package PlaceOrder;

public class Invoice implements InvoiceInterface {
	@Override
	public String createInvoice(Object... operands) {
//		invoice_id, order_id, amount, tax, subtotal
		if (operands.length != 5) {
			return "INVALID";
		}
		if (!(operands[0] instanceof Integer) || (Integer)operands[0] <= 0) {
			return "INVALID invoice_id";
		}
		if (!(operands[1] instanceof Integer) || (Integer)operands[1] <= 0) {
			return "INVALID order_id";
		}
		if (!(operands[2] instanceof Float) || (Float)operands[2] <= 0) {
			return "INVALID amount";
		}
		if (!(operands[3] instanceof Float) || (Float)operands[3] <= 0) {
			return "INVALID tax";
		}
		if (!(operands[4] instanceof Float) || (Float)operands[4] <= 0) {
			return "INVALID subtotal";
		}
		return "Invoice created";
	}
	
	@Override 
	public String getInvoice(Integer invoice_id) {
		if (invoice_id <= 0) {
			return "INVALID";
		}
		
		return "Invoice returned";
	}
}
